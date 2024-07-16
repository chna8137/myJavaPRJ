package jeongseok;

import java.util.ArrayList;

class Customer2 implements Runnable {
    private Table2 table2;
    private String food2;

    Customer2(Table2 table2, String food2) {
        this.table2 = table2;
        this.food2 = food2;
    }

    public void run() {
        while (true) {
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            String name = Thread.currentThread().getName();

            table2.remove(food2);
            System.out.println(name + " ate a " + food2);
        } // while
    }
}

class Cook2 implements Runnable {
    private Table2 table;

    Cook2(Table2 table) { this.table = table; }

    public void run() {
        while (true) {
            int idx = (int)(Math.random() * table.dishNum());
            table.add(table.dishNames[idx]);
            try { Thread.sleep(10); } catch (InterruptedException e) {}
        } // while
    }
}

class Table2 {
    String[] dishNames = {"donut", "donut", "burger"}; // donut의 확률을 높인다.
    final int MAX_FOOD = 6;
    private ArrayList<String> dishes = new ArrayList<>();

    public synchronized void add(String dish) { // synchronized를 추가
        while (dishes.size() >= MAX_FOOD) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " is waiting.");
            try {
                wait(); // COOK쓰레드를 기다리게 한다.
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
        dishes.add(dish);
        notify(); // 기다리고 있는 CUST를 깨우기 위함.
        System.out.println("Dishes:" + dishes.toString());
    }

    public synchronized void remove(String dishName) {
        String name = Thread.currentThread().getName();

        while (dishes.size() == 0) {
            System.out.println(name + " is waiting.");
            try {
                wait(); // CUST 쓰레드를 기다리게 한다.
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }

        while (true) {
            for (int i = 0; i < dishes.size(); i++) {
                if (dishName.equals(dishes.get(i))) {
                    dishes.remove(i);
                    notify();
                    return;
                }
            } // for문의 끝

            try {
                System.out.println(name + " is waiting.");
                wait(); // 원하는 음식이 없는 CUST쓰레드를 기다리게 한다.
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        } // while(true)
    } // remove 메서드 끝

    public int dishNum() { return dishNames.length; }
}

public class ThreadWaitEx3 {
    public static void main(String[] args) throws Exception {
        Table2 table = new Table2(); // 여러 쓰레드가 공유하는 객체

        new Thread(new Cook2(table), "COOK1").start();
        new Thread(new Customer2(table, "donut"), "CUST1").start();
        new Thread(new Customer2(table, "burger"), "CUST2").start();

        Thread.sleep(2000);
        System.exit(0);
    }
}

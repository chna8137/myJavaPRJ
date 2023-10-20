package practice;

public class Over {


    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Over over = new Over();

        int result1 = over.add(5, 10); // int형 매개변수를 사용하는 메서드 호출
        System.out.println("Result 1: " + result1);

        double result2 = over.add(2.5, 3.7); // double형 매개변수를 사용하는 메서드 호출
        System.out.println("Result 2: " + result2);

        int result3 = over.add(1, 2, 3); // int형 매개변수 3개를 사용하는 메서드 호출
        System.out.println("Result 3: " + result3);
    }
}



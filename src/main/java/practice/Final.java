package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Final {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.print("입력값 : ");
            list.add(sc.nextInt());
            list.get(i);
        }

        //selection sort
        int index;
        for (int i = 0; i < list.size(); i++) {
            index = i;
            for (int j = i; j < list.size(); j++) {
                if (list.get(index) > list.get(j))
                    index = j;
            }
            list.add(i, list.get(index));
            list.remove((index + 1));
        }

        list.forEach(i -> System.out.println("출력 값: " + i));
    }
}



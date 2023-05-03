package Quiz;

import java.util.LinkedList;
import java.util.Scanner;

public class Quiz_0502 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);

        int i;
        int temp = 0;

        for (i = 1; i <= 5; i++) {
            list.add(sc.nextInt());
        }
        for (int j = 0; j < 5; j++) {
            for (int k = j; k < 5; k++) {
                if (list.get(j) < list.get(k)) { //list.get을 이용하여 j와 k의 값을 받음
                    temp = list.get(k); //자리 이동을 위한... temp에 k의 값을 저장(이동)
                    list.set(k, list.get(j));
                    list.set(j, temp);
                }
            }

        }
        System.out.println(list);
    }
}

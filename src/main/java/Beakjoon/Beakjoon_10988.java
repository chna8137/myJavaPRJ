package Beakjoon;

import java.util.Scanner;

public class Beakjoon_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int mid = (a.length() / 2);
        int sw = 1;
        for (int i = 0; i < mid; i++) {
            if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {
                sw = 0;
            }
        }

        System.out.println(sw);
    }
}

package Beakjoon;

import java.util.Scanner;

public class Beakjoon_25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double d = 0;
        double point = 0;

        for (int i = 0; i < 20; i++) {
            String title = sc.next();
            double a = sc.nextDouble();
            String b = sc.next();

            if (b.equals("A+")){
                d += a * 4.5;
                point += a;
            } else if (b.equals("A0")) {
                d += a * 4.0;
                point += a;
            }else if (b.equals("B+")) {
                d += a * 3.5;
                point += a;
            }else if (b.equals("B0")) {
                d += a * 3.0;
                point += a;
            }else if (b.equals("C+")) {
                d += a * 2.5;
                point += a;
            }else if (b.equals("C0")) {
                d += a * 2.0;
                point += a;
            }else if (b.equals("D+")) {
                d += a * 1.5;
                point += a;
            }else if (b.equals("D0")) {
                d += a * 1.0;
                point += a;
            }else if (b.equals("F")) {
                d += a * 0.0;
                point += a;
            }
        }

        System.out.printf("%.6f", d / point);
    }
}

package Beakjoon;

import java.util.Scanner;

public class Beakjoon_24313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f1 = sc.nextInt();
        int f2 = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();

        int a = f1 * n + f2;
        int b = c*n;

        if (a <= b && f1 <= c){
            System.out.println(1);
        }else
        {
            System.out.println(0);
        }
    }
}

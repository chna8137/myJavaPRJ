package codeup;

import java.util.Scanner;

public class Codeup_1369 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (i == 1 || i == a || j == 1 || j == a){
                    System.out.print("*");
                }else if (b == 1) {
                    System.out.print("*");
                }else if ((i + j) % b == 1) {
                    System.out.print("*");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
}

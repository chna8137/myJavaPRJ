package codeup;

import java.util.Scanner;

public class Codeup_1677 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int i, j;

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (i == 0 || i == n - 1) {
                    if (j == 0 || j == m - 1)
                        System.out.print("+");
                    else
                        System.out.print("-");
                } else if (j == 0 || j == m - 1)
                    System.out.print("|");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
package codeup;

import java.util.Scanner;

public class Codeup_1464 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] arr = new int[a][b];
        int cnt = 1;

        for (int i = a - 1; i >= 0; i--) {
            for (int j = b - 1; j >= 0; j--) {
                arr[i][j] = cnt;
                cnt++;
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}

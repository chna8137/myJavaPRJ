package Beakjoon;

import java.util.Scanner;

public class Beakjoon_10810 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();

            for (int j = c - 1; j < d; j++) {
                arr[j] = e;

            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}

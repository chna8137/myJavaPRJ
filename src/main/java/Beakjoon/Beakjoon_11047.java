package Beakjoon;

import java.util.Scanner;

public class Beakjoon_11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] coin = new int[n];

        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i >= 0; i--) {

            if (coin[i] <= k) {
                count += (k /coin[i]);
            }
        }
        System.out.println(count);
    }
}

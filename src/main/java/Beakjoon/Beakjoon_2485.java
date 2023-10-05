package Beakjoon;

import java.util.Scanner;

public class Beakjoon_2485 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        int[] diff_arr = new int[n-1];

        int first = sc.nextInt(); // 첫번째 가로수 위치
        data[0] = first;
        for (int i=1; i<n; i++) {
            int value = sc.nextInt();
            data[i] = value;
            diff_arr[i-1] = value - first;
            first = value;
        }

        int gcd_num = diff_arr[0];
        for (int i=1; i<diff_arr.length; i++) {
            gcd_num = gcd(gcd_num, diff_arr[i]);
        }

        int result = 0;
        for (int i=1; i<n; i++) {
            int diff = data[i] - data[i-1] -1;
            result += (int)(diff / gcd_num);
        }

        System.out.println(result);
    }

    static int gcd(int a, int b) {

        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }

        return a;
    }
}

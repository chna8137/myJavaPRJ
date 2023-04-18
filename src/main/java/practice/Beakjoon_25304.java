package practice;

import java.util.Scanner;

public class Beakjoon_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();
        int hap = 0;

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int o = sc.nextInt();
            hap += p * o; //hap = hap + p * o
        }
        if (hap == x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

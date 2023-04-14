package practice;

import java.util.Scanner;

public class Beakjoon_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int reward = 0;
        int max = 0;

        if (a == b && a == c) {
            reward = 10000 + (a) * 1000;
        } else if (a == b || a == c) {
            reward = 1000 + (a) * 100;
        } else if (a != b && a != c) {
            if (a < b && c < b) {
                max = b;
            } else if (b < c && a < c) {
                max = c;
            } else if(b < a && c < a)
            {
                max = a;
            }
            reward = max * 100;
        }
        System.out.printf("%d", reward);
    }
}

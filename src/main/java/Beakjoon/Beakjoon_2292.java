package Beakjoon;

import java.util.Scanner;

public class Beakjoon_2292 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = 1;
        int a = sc.nextInt();
        int ran = 2;

        if (a == 1) {
            System.out.println(1);
        }

        else {
            while (ran <= a) {
                ran = ran + (6 * cnt);
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}

package practice;

import java.util.Scanner;

public class Beakjoon_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();

        int min = 60 * h + m; //60*17+40=1060
        min += c;//1060 + 80 = 1140

        int hour = (min / 60) % 24;//17.66666
        int minute = min % 60; // 0

        System.out.println(hour + " " + minute);
    }
}

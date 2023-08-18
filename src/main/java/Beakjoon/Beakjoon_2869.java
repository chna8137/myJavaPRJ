package Beakjoon;

import java.util.Scanner;

public class Beakjoon_2869 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int up = sc.nextInt();		// A
        int down = sc.nextInt();	// B
        int length = sc.nextInt(); 	// C

        int day = (length - down) / (up - down);// 달팽이가 정상에 오르기 전날까지의 날

        // 나머지가 있을 경우 (잔여 블럭이 있을 경우)
        if ((length - down) % (up - down) != 0) { // 달팽이가 하루에 오르는 높이보다 정상까지의 높이가 짧을때
            day++;
        }
        System.out.println(day);
    }
}

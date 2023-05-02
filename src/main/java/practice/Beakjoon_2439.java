package practice;

import java.util.Scanner;

public class Beakjoon_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) { // 줄을 반복하기 위한 반복문
            for (int j = 1; j <= a-i; j++) { //공백을 출력하기 위한 반복문
                System.out.printf(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
package practice;

import java.util.Scanner;

public class C_study2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score;

        System.out.printf("점수를 입력하세요 : ");
        score = sc.nextInt();

        if (score >= 90) {
            System.out.print("A 학점입니다.");
        } else if (score >= 80) {
            System.out.print("B 학점입니다.");
        } else if (score >= 70) {
            System.out.print("C 학점입니다.");
        } else if (score >= 60) {
            System.out.print("D 학점입니다.");
        } else {
            System.out.println("F 학점입니다.");
        }
    }
}

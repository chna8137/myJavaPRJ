package practice;

import java.util.Scanner;

public class Pr_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;

        System.out.printf("정수를 입력하세요 ==> ");
        a = sc.nextInt();

        System.out.printf("10진수 ==> %d \n", a);
        System.out.printf("16진수 ==> %x \n", a);
        System.out.printf("8진수 ==> %o \n", a);
    }
}

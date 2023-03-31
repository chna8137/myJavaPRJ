package practice;

import java.util.Scanner;

public class Pr_06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;
        int c;

        System.out.printf("첫번째 계산할 값을 입력하세요 ==> ");
        a = sc.nextInt();

        System.out.printf("<1>덧셈 <2>뺄셈 <3>곱셈 <4>나눗셈 ==> ");
        c = sc.nextInt();

        System.out.printf("두번째 계산할 값을 입력하세요 ==> ");
        b = sc.nextInt();

        if (c == 1) {
            System.out.printf("%d + %d = %d \n",a,b,a+b);
        } else if (c == 2) {
            System.out.printf("%d - %d = %d \n",a,b,a-b);
        } else if (c == 3) {
            System.out.printf("%d * %d = %d \n",a,b,a*b);
        } else if (c == 4) {
            System.out.printf("%d / %d = %d \n",a,b,a/b);
        }



    }
}

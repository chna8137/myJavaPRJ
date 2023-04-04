package practice;

import java.util.Scanner;

public class Pr_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        char c;

        System.out.print("첫번째 수를 입력하세요 : ");
        a = sc.nextInt();
        System.out.print("계산할 연산자를 입력하세요. : ");
        c = sc.next().charAt(0);
        System.out.print("두번째 수를 입력하세요. : ");
        b = sc.nextInt();

        if (c == '+') {
            System.out.printf("%d + %d = %d 입니다.", a, b, a + b);
        }
        if (c == '-') {
            System.out.printf("%d - %d = %d 입니다.", a, b, a - b);
        }
        if (c == '*') {
            System.out.printf("%d * %d = %d 입니다.", a, b, a * b);
        }
        if (c == '/') {
            System.out.printf("%d / %d = %d 입니다.", a, b, a / b);
        }
    }
}


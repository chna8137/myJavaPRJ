package practice;

import java.util.Scanner;

public class Pr_13 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int a,b;
        char c;

        System.out.printf("첫번째 수를 입력하세요 : ");
        a = sc.nextInt();
        System.out.printf("계산할 연산자를 입력하세요 : ");
        c = sc.next().charAt(0);
        System.out.printf("두번째 수를 입력하세요 : ");
        b =  sc.nextInt();

        if (c == '+') {
            System.out.printf("%d + %d = %d 입니다.", a, b, a + b);
        }
        else if(c == '-') {
            System.out.printf("%d - %d = %d 입니다.", a, b, a - b);
        }
        else if(c == '*') {
            System.out.printf("%d * %d = %d 입니다.", a, b, a * b);
        }
        else if (c == '/') {
            System.out.printf("%d / %d = %d 입니다.", a, b, a / b);
        } else if (c == '%') {
            System.out.printf("%d %% %d = %d 입니다.", a, b, a % b);
        }else
            System.out.println("연산자를 잘못 입력했습니다.");
    }
}

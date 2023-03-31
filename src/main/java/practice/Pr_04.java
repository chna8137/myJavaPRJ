package practice;

import java.util.Scanner;

public class Pr_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a, b;
        char c;

        System.out.printf("첫 번째 수를 입력하세요 : ");
        a = s.nextInt();

        System.out.printf("계산할 연산자를 입력하세요 : ");
        c = s.next().charAt(0);

        System.out.printf("두 번째 수를 입력하세요 : ");
        b = s.nextInt();

        if (c == '+') {
            System.out.printf("%d + %d = %d \n", a, b, a + b);
        } else if(c == '-'){
            System.out.printf("%d - %d = %d \n", a, b, a - b);
        }else{
            System.out.printf("올바른 수식이 아닙니다");
        }

    }
}

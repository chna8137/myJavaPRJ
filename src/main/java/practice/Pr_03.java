package practice;

import java.util.Scanner;

public class Pr_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a, b, c, d;

        System.out.printf("첫 번째 계산할 값을 입력하세요 => ");
        a = s.nextInt();

        System.out.printf("두 번째 계산할 값을 입력하세요 => ");
        b = s.nextInt();

        System.out.printf("세 번째 계산할 값을 입력하세요 => ");
        c = s.nextInt();

        System.out.printf("네 번째 계산할 값을 입력하세요 => ");
        d = s.nextInt();

        System.out.printf("%d + %d + %d + %d = %d \n", a, b, c, d, a+b+c+d);

    }
}

package practice;

import java.util.Scanner;

public class Pr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;

        System.out.printf("첫 번째 계산할 값을 입력하세요 => ");
        a = sc.nextInt();

        System.out.printf("두 번째 계산할 값을 입력하세요 => ");
        b = sc.nextInt();

        System.out.printf("세 번쨰 계산할 값을 입력하세요 => ");
        c = sc.nextInt();

        System.out.printf("네 번째 계산할 값을 입력하세요 => ");
        d = sc.nextInt();

        System.out.printf("%d + %d + %d + %d = %d", a, b, c, d, a + b + c + d);

    }
}

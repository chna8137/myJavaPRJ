package practice;

import java.util.Scanner;

public class C_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b,c,d;
        int result;

        System.out.printf("첫번째 계산할 값을 입력하세요 ==> ");
        a = sc.nextInt();
        System.out.printf("두번째 계산할 값을 입력하세요  ==> ");
        b = sc.nextInt();
        System.out.printf("세번째 계산할 값을 입력하세요  ==> ");
        c = sc.nextInt();
        System.out.printf("네번째 계산할 값을 입력하세요  ==> ");
        d = sc.nextInt();

        result = a+b+c+d;
        System.out.printf("%d + %d + %d + %d = %d \n",a,b,c,d,result);

    }
}

package practice;

import java.util.Scanner;

public class C_511 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;
        char c = ' ';

        System.out.printf("수식을 한줄로 띄어쓰기로 입력하세요 : ");
        a = sc.nextInt();
        c = sc.next().charAt(0);
        b = sc.nextInt();


        switch (c){
            case '+' :
                System.out.printf("%d + %d = %d 입니다.\n",a,b,a+b);
                break;
            case '-' :
                System.out.printf("%d - %d = %d 입니다.\n",a,b,a-b);
                break;

            case '*' :
                System.out.printf("%d + %d = %d 입니다.\n",a,b,a*b);
                break;

            case '/' :
                System.out.printf("%d + %d = %d 입니다.\n",a,b,a/b);
                break;

            case '%' :
                System.out.printf("%d + %d = %d 입니다.\n",a,b,a%b);
                break;

            default:
                System.out.println("연산자를 잘못 입력했습니다.");
        }

    }
}

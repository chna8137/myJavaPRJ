import java.util.Scanner;

public class pr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        char c;

        System.out.print("첫 번째 수를 입력하세요 : ");
        a = sc.nextInt();

        System.out.print("계산할 연산자를 입력하세요 : ");
        c = sc.next().charAt(0);

        System.out.print("두 번째 수를 입력하세요 : ");
        b = sc.nextInt();

        if (c == '+') {
            System.out.printf("%d + %d = %d", a, b, a + b);
        } else if (c == '-') {
            System.out.printf("%d - %d = %d", a, b, a - b);
        } else {
            System.out.print("올바른 연산자가 아닙니다.");
        }
    }


}


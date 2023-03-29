import java.util.Scanner;

public class Ex05_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);//**새로운 자바파일을 메모리에 올릴때 new 를 반드시 입력해야함
        int a;                             //System.in 자료를 받아서 올려라...

        System.out.printf("정수를 입력하세요 : ");
        a = s.nextInt();

        if (a % 2 == 0) {
            System.out.printf("짝수를 입력했군요..\n");
        } else {
            System.out.printf("홀수를 입력했군요..\n");
        }
    }
}

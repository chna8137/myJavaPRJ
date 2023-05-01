package Ex;

import java.util.Scanner;

public class Ex09_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ss;
        String tt = "";
        int count, i;

        System.out.printf("문자열을 입력하세요 : ");
        ss = sc.nextLine();

        count = ss.length();

        for (i = 0; i < count; i++) {
            tt += ss.charAt(count - (i + 1));
        }
        System.out.printf("내용을 거꾸로 출력 ==> %s \n", tt);
    }
}


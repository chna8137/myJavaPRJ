package C_study;

import java.util.Scanner;

public class C_study {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year;

        System.out.printf("년도를 입력하세요 : ");
        year = sc.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year + "년은 윤년입니다.");
        } else if (year % 400 == 0) {
            System.out.println(year + "년은 윤년입니다.");
        } else {
            System.out.println(year + "년은 윤년이 아닙니다.");
        }
    }
}

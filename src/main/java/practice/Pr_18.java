package practice;

import java.util.Scanner;

public class Pr_18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] aa = new int[4];
        int hap;

        for (int i = 0; i < 4; i++) {
            System.out.printf(i + 1 + "번째 숫자를 넣으세요 : ");
            aa[i] = s.nextInt();
            //위 코드가 아래 코드와 동일하게 작동 for문으로 만들었을 때
        }
            hap = aa[0] + aa[1] + aa[2] + aa[3];
            System.out.printf(" 합계 ==> %d \n", hap);
    }
}
//Ex08_02 참고
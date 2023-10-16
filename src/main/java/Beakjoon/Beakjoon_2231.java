package Beakjoon;

import java.util.Scanner;

public class Beakjoon_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = 0;


        for(int i = 0; i < n ; i++) {
            int num = i;
            int sum = 0;	// 각 자릿수 합 변수

            while(num != 0) {
                sum += num % 10;	// 각 자릿수 더하기
                num /= 10;
            }

            // i 값과 각 자릿수 누적합이 같을 경우 (생성자를 찾았을 경우)
            if(sum + i == n) {
                result = i;
                break;
            }

        }

        System.out.println(result);
    }
}

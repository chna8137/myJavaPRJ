package Beakjoon;

import java.util.Scanner;

public class Beakjoon_10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        // 삼각형 입력받기
        int sum = 0; // 세 각의 합
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];

        }

        // 배열 내 같은 각이 있는 경우 카운트 해주기
        int cnt = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
//					System.out.println(cnt);
                }
            }
        }

        // 결과 출력
        String result = "";
        for (int i = 0; i < arr.length - 1; i++) {

            if (sum != 180) {
                result = "Error";
            } else {

                if (arr[i] == 60&& cnt == 3) {
                    result = "Equilateral";
                } else if (sum == 180 && cnt == 1) {
                    result = "Isosceles";
                } else if (sum == 180 && cnt == 0) {
                    result = "Scalene";
                }
            }
        }
        System.out.println(result);
        sc.close();
    }

}
package Beakjoon;

import java.util.Scanner;

public class Beakjoon_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0; //중복 값 몇개 인지 계산하기 위한 변수
        int i = sc.nextInt();
        int arr[] = new int[i];


        for (int a = 0; a < i; a++) {
            arr[a] = sc.nextInt();
        }

        int l = sc.nextInt();//중복되는 숫자를 출력하기 위한 변수

        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == l) { //배열 k가 l와 같은 값이면
                count++; // 카운트 값이 1씩 증가한다.
            }
        }
        System.out.println(count);

    }
}


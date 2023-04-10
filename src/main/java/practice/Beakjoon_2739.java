package practice;

import java.util.Scanner;

public class Beakjoon_2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;//i는 단, k는 뒷자리 숫자로 설정
        i = sc.nextInt();

        for (int k = 1; k < 10; k++) {
            System.out.printf("%d x %d = %d \n",i, k, i*k);
            }
        }
    }

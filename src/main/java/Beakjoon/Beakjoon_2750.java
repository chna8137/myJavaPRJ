package Beakjoon;

import java.util.Scanner;

public class Beakjoon_2750 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //수의 개수
        int n = sc.nextInt();
        //입력받는 수의 배열
        int[] arr = new int[n];
        //배열을 바꿀 때 임시저장변수
        int tmp;

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    tmp=arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}

package Beakjoon;

import java.util.Scanner;

public class Beakjoon_2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 색종이 개수
        int[][] arr = new int[100][100];

        int count = 0;
        for(int i=0;i<N;i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            for(int a=X;a<X+10;a++) {
                for(int b=Y;b<Y+10;b++) arr[a][b] = 1;
            }
        }

        for(int i=0;i<100;i++) {
            for(int j=0;j<100;j++) {
                if(arr[i][j]==1) count++;
            }
        }

        System.out.println(count);
    }

}
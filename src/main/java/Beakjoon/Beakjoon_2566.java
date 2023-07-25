package Beakjoon;

import java.util.Scanner;

public class Beakjoon_2566 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nums[][] = new int[10][10];
        int max = 0;
        int a = 0, b = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                nums[i][j] = sc.nextInt();
                if (max < nums[i][j]){
                    max = nums[i][j];
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((a + 1) + " " + (b + 1));
    }
}

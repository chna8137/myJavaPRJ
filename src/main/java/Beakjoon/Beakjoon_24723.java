package Beakjoon;

import java.util.Scanner;

public class Beakjoon_24723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 1;
        for(int i = 0; i < n; i++) {
            sum *= 2;
        }
        System.out.println(sum);
    }
}
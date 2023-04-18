package practice;

import java.util.Scanner;

public class Pr_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] aa = new int[100];
        int[] bb = new int[100];
        int i;

        for (i = 0; i < 100; i++) {
            aa[i] = i * 3;
            System.out.printf("aa[%d] = %d \t", i, aa[i]);
        }
        System.out.println();
        for (i = 0; i < 100; i++) {
            if (i < 50) {
                bb[i] = i + 50;
            } else
                bb[i] = i - 50;
            System.out.printf("aa[%d]=bb[%d] \t", i, bb[i]);
        }
    }
}

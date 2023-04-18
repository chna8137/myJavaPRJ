package practice;

import java.util.Scanner;

public class Beakjoon_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        int max = arr[0];
        int index = arr[0];

        for (int w = 0; w < arr.length; w++) {
            arr[w] = sc.nextInt();
        }

        for (int k = 0; k < arr.length; k++) {
            if (arr[k] > max) {
                max = arr[k];
                index = k + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}

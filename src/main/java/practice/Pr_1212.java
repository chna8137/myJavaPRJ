package practice;

import java.util.Scanner;

public class Pr_1212 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            int input = sc.nextInt();
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] == input) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                continue;
            }
            arr[i] = input;
        }

        System.out.print("저장 된 값은 : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
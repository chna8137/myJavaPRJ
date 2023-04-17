package practice;

import java.util.Scanner;

public class Quiz_4017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            for (int k = 0; k < arr.length; k++) {
                if (num == arr[k]) {
                    break;
                }
                if (i == k) {
                    arr[index++] = num;
                }
            }
        }
        System.out.print("저장 된 값은 : ");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i]);
        }
    }
}
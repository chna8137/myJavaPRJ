package codeup;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Codeup_1261 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];

        int result = 0;
        int a = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if (num[i] % 5 == 0) {
                result = num[i];
                System.out.println(result);
                break;
            }
        }
        if (result == 0){
            System.out.println(result);
        }
    }
}

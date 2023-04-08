package practice;

import java.util.Scanner;

public class Array_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int hap = 0;

        int i = 0;
        while (i < arr.length) {
            System.out.printf("%d번째 숫자를 입력하세요 : ", i + 1);
            arr[i] = sc.nextInt();
            i++;

//        for(int i = 0; i <arr.length; i++){
//            System.out.print(i+1 + "번째 숫자를 입력하세요 : ");
//            arr[i] = sc.nextInt();
        }
    }
}

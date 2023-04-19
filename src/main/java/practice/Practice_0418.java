package practice;

import java.util.Scanner;

public class Practice_0418 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[]arr = new int[5];
        int temp = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int j = 0; j < arr.length; j++){
            for(int k = j+1; k < arr.length; k++){
                if(arr[j]<arr[k]){
                    temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        for(int k = 0; k < arr.length; k++){
            System.out.printf("%d ",arr[k]);
        }
    }
}

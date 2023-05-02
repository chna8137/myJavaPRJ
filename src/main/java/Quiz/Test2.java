package Quiz;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int hap = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            } else if (arr[i] <= min) {
                min = arr[i];
            }
            hap += arr[i];
        }
        System.out.printf("가장 큰 값 : %d/ 가장 작은 값 : %d/ 평균 값 : %d", max, min, hap / 5);
    }
}

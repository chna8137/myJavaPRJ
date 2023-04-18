import java.util.Scanner;

public class Beakjoon_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int[] arr = new int[i];

        for (int k = 0; k < arr.length; k++) {
            arr[k] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for (int l = 0; l < arr.length; l++) {
            if (arr[l] < min) {
                min = arr[l];
            } else if (arr[l] > max) {
                max = arr[l];
            }
        }
        System.out.printf("%d %d", min, max);
    }
}



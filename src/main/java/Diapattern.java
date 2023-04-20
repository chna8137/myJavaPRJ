public static void main(String []args){
import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 다이아몬드 크기 입력받기
        System.out.print("다이아몬드의 크기를 입력하세요(홀수만 가능): ");
        int n = scanner.nextInt();

        // 다이아몬드 모양으로 별 찍기
        for (int i = 0; i < n; i++) {
            if (i < n/2 + 1) {
                for (int j = 0; j < n/2 - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2*i+1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 0; j < i - n/2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2*(n-i)-1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}

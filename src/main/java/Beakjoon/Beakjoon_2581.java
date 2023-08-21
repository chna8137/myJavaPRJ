package Beakjoon;

import java.util.Scanner;

public class Beakjoon_2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("M : ");
        int M = sc.nextInt();
        System.out.print("N : ");
        int N = sc.nextInt();
        //Scanner를 사용해서 값 입력하기.

        int sum = 0;
        int min = 10000;
        int cnt = 0;
        //소수들의 합을 구할 변수 sum과
        //소수를 판별할 변수 cnt를 0으로 초기화.
        //최소값을 구할 변수 min을 10000으로 초기화.

        if (M > N) {
            System.out.println("M은 N보다 작거나 같아야 합니다.");
        } else {
            if (M > 0 && M <= 10000 && N > 0 && N <= 10000) {
                for (int i = M; i <= N; i++) {
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            cnt++;
                            //이중 for문 이용
                            //i의 범위는 M부터 N까지(나누어지는 수)
                            //j의 범위는 2부터 i까지(나누는 수)
                            //2부터 시작하는 이유 : 1은 모든 수의 약수이기 때문.
                            //i%j의 값이 0이면 -> 약수가 1개 이상 있는 것!
                            //따라서 cnt++

                        }
                    }
                    if (cnt == 0) {
                        sum += i;
                        if (min > i) {
                            min = i;
                            //N을 포함하지 않은 범위이기 때문에
                        }
                    }
                    cnt = 0;
                }
                if (sum == 0) {
                    System.out.println(-1);
                }
                System.out.println(sum);
                System.out.println(min);
            }
        }
    }
}

package Beakjoon;

import java.util.Scanner;

public class Beakjoon_9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        while(n != -1) {
            n = sc.nextInt();
            int sum = 0;
            for(int i=1; i<=n/2; i++) {
                if(n%i == 0) {
                    sum += i;
                }
                if(sum == n) {
                    System.out.print(n + " = ");
                    for(int j=1; j<=n/2; j++) {
                        if(j == n/2) {
                            System.out.print(j);
                        } else  if(n%j == 0){
                            System.out.println(j + " + ");
                        }

                    }
                }
                else if(sum > n) {
                    System.out.println(n + " is NOT perfect.");
                }
            }
            System.out.println();
        }
    }
}
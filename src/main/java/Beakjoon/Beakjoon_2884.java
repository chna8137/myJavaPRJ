package Beakjoon;

import java.util.Scanner;

public class Beakjoon_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if (m < 45) { //만약 m이 45보다 작다면 ex) 30 < 45 true
            h--; //h에 저장된 숫자가 1씩 감소한다. //ex)h에 11이 저장되있었다면 10으로 감소
            m = 60 - (45 - m); //45-m을 하고 그 값에 -60을 한 값을 m에 저장한다. m = 60-(45-30) => m = 45
            if (h < 0) { //h가 0보다 작다면
                h = 23; // h에 23이 저장된다.
            }
            System.out.println(h + " " + m);
        } else {
            System.out.println(h + " " + (m - 45));
        }

    }

}

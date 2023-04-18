package codeup;

import java.util.Scanner;

public class Codeup_1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] date = s.split("[.]");

        int y = Integer.parseInt(date[0]);
        int m = Integer.parseInt(date[1]);
        int d = Integer.parseInt(date[2]);

        System.out.printf("%04d.%02d.%02d",y,m,d);
    }
}

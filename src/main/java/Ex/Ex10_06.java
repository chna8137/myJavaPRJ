package Ex;

import java.util.Scanner;

public class Ex10_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a;
        short b;
        int c;
        long d;
        float e;
        double f;
        String str1, str2;

        System.out.print("byte : ");
        a = sc.nextByte();
        System.out.print("short : ");
        b = sc.nextShort();
        System.out.print("int : ");
        c = sc.nextInt();
        System.out.print("long : ");
        d = sc.nextLong();
        System.out.print("float : ");
        e = sc.nextFloat();
        System.out.print("double : ");
        f = sc.nextDouble();
        System.out.print("str1 : ");
        str1 = sc.next();
        System.out.print("str2 : ");
        str2 = sc.nextLine();
    }
}

package Programmers;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class P_181945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int l = a.length();

        for (int i = 0; i < l; i++) {
            System.out.println(a.charAt(i));
        }
    }
}

package codeup;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class Codeup_1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[]arr = s.split("\\-");

        System.out.printf("%s%s",arr[0],arr[1]);
    }
}

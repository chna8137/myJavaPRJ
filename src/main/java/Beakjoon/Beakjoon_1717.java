package Beakjoon;

import java.util.Scanner;

public class Beakjoon_1717 {
    static int[] parent;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        parent = new int[n + 1];
        for(int i = 0; i <= n; i++) {
            parent[i] = i;
        }

        int m = sc.nextInt();
        for(int i = 0; i < m; i++) {
            int kind = sc.nextInt();
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int p1 = find(num1);
            int p2 = find(num2);

            if(kind == 0 && p1 != p2) union(p1, p2);
            else if(kind == 1 && p1 != p2) System.out.println("NO");
            else if(kind == 1 && p1 == p2) System.out.println("YES");
        }
    }

    public static void union(int a, int b) {
        parent[a] = b;
    }

    public static int find(int a) {
        if(parent[a] == a) return a;
        else return parent[a] = find(parent[a]);
    }
}

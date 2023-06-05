package Programmers;

import java.util.Arrays;
import java.util.Scanner;

public class P_172927 {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        int b = 5;
        int a = 0;
        for (int i = 0; i < 1; i++) {
            a = (int) (Math.random() * 3);
            if (picks[i] == 0){
                i--;
            }
        }
        for (int i = 0, j = 0; i < picks[0] + picks[1] + picks[2] && j < minerals.length; i++, j++) {
            if (minerals[i].equals("stone")) {
                if (picks[a] == 0) {
                    picks[a]--;
                    answer += 1;
                } else if (picks[a] == 1) {
                    picks[a]--;
                    answer += 1;
                } else {
                    picks[a]--;
                    answer += 1;
                }
            } else if (minerals[i].equals("iron")) {
                if (picks[a] == 0) {
                    picks[a]--;
                    answer += 5;
                } else {
                    picks[a]--;
                    answer += 1;
                }
            } else {
                if (picks[a] == 0) {
                    picks[a]--;
                    answer += 25;
                } else if (picks[a] == 1) {
                    picks[a]--;
                    answer += 5;
                } else {
                    picks[a]--;
                    answer += 1;
                }
            }
            b--;
            if (b == 0) {
                i--;
                b = 0;
                for (int k = 0; k < 1; k++) {
                    a = (int) (Math.random() * 3);
                    if (picks[k] == 0){
                        k--;
                    }
                }
                continue;
            }
            System.out.println(answer);
            System.out.println(Arrays.toString(picks));
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String aaa = s.nextLine();
        aaa = aaa.replace("\"", "");
        aaa = aaa.replace(" ", "");
        String[] minerals = aaa.split(",");
        int[] picks = new int[3];
        for (int i = 0; i < picks.length; i++) {
            picks[i] = s.nextInt() * 5;
        }
        int dia = picks[0];
        int iron = picks[1];
        int st = picks[2];
        P_172927 a = new P_172927();
        System.out.printf("%d", a.solution(picks, minerals));
    }
}

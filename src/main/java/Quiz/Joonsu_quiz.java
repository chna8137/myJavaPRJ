package Quiz;

import java.util.HashSet;
import java.util.Scanner;

public class Joonsu_quiz {
    public static void main(String[] args) {
        HashSet<Integer>set = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            set.add(sc.nextInt());
        }
        System.out.println(set);
    }
}

package practice;

public class Quiz_02 {
    public static void main(String[] args) {

        int i, j;

        for (i = 1, j = 1; j < 6; i++) {
            System.out.print("*");

            if (i >= j) {
                i = 0;
                j++;
                System.out.println();

            }
        }
    }
}

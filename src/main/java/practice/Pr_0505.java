package practice;

public class Pr_0505 {
    public static void main(String[] args) {

        int[][] gugu = new int[9][9];
        int i, k;

        for (i = 0; i < 9; i++) {
            for (k = 0; k < 9; k++) {
                gugu[i][k] = (i + 2) * (k + 1);
            }
        }
        for (i = 0; i < 8; i++) {
            for (k = 0; k < 9; k++) {
                System.out.printf("%d x %d = %2d\t", i+2, k+1, gugu[i][k]);
            }
            System.out.println();
        }
    }
}

package practice;

public class Timetable_02 {
    public static void main(String[] args) {
        int i, j;

        for (i = 1; i <= 9; i++) {
            for (j = 2; j <= 9; j++) {
                System.out.printf("%d x %d = %d \t", j, i, j * i);
            }
            System.out.println();
        }
    }
}

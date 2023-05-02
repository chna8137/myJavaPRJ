package Quiz;

public class Timetable_04 {
    public static void main(String[] args) {

        int i, k;
        i = 2;
        k = 1;

        while (i < 10) {
            System.out.printf("%d x %d = %d \n", i, k, i * k);
            k++;
            if (k == 10) {
                i++;
                k = 1;
                System.out.println();
            }

        }

    }
}

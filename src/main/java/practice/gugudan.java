package practice;

public class gugudan {
    public static void main(String[] args) {

        int i, j;

//        for(i = 1; i < 10; i++){
//            for (j = 2; j < 10; j++) {
//                System.out.printf("%d x %d = %d \t",j,i,j*i);
//            }
//            System.out.println();

        for (i = 2, j = 1; i < 10; j++) {
            System.out.printf("%d x %d = %d \t", i, j, i * j);
            if (j == 9) {
                i++;
                j = 0;
                System.out.println();
            }
        }
    }
}

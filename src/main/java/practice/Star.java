package practice;

public class Star {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            for (int j = 0; i > j; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = 1; k < 4; k++) {
            for (int l = 4; k < l; l--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

package practice;

public class Star2 {
    public static void main(String[] args) {
        System.out.println("삼각형 별 찍기");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("마름모");

        for (int i = 0; i < 4; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k > i*2; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("for문 하나만 써서 별찍기");
        int i,j;
        for(i = 1,j = 1; j < 6; i++){
            System.out.print("*");
            if(i >= j){
                i = 0;
                j++;
                System.out.println();
            }

        }
    }
}

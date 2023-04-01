package practice;
public class Pr_09 {
    public static void main(String[] args) {

        int hap = 0;
        int i;

        for (i = 1; i < 11; i++) {
            hap += i;
        }
        System.out.printf("1에서 10까지의 합 : %d \n", hap);
    }
}
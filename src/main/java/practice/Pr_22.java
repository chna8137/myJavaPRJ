package practice;

public class Pr_22 {
    public static void main(String[] args) {

        int hap = 0;
        int i = 1;
        int max = 0;

        while (i <= 100) { // i가 100보다 작거나 같으면
            if (i < 50 || i > 59) { // i가 50보다 작고, 59보다 크면
                hap += i;
                max = i;
            }
            i++;
        }
        System.out.printf("1부터 100까지 숫자에서 50~59까지의 숫자는 빼고 덧셈한 합계 : %d \n", hap);
        System.out.printf("더해진 최대숫자는 %d입니다. \n", max);
        System.out.printf("반복횟수는 %d입니다. \n", i);
    }

}

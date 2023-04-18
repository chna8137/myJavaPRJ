package practice;

public class Pr_21 {
    public static void main(String[]args){

        int hap = 0;
        int i;
        int max = 0;

        for(i = 1 ;i <= 100; i++){//1...100까지 반복
            if(i < 50 || i >59){ // i가 50보다 작거나 59보다 크면
                hap += i; // hap에 i + hap한 값을 저장한다.
                max=i;
            }
        }
        System.out.printf("1에서 100까지 숫자에서 50~59까지의 숫자는 빼고 덧셈한 합계 : %d \n", hap);
        System.out.printf("더해진 최대 숫자는 %d입니다. \n", max);
    }
}

package practice;

public class Pr_17 {
    public static void main(String[] args) {

          int hap = 0;
          int i = 1;

          System.out.printf("1부터 100까지 숫자에서 50 ~ 59까지의 숫자는 빼고 덧셈함 합계 : ");

          for(; i <= 100; i++){
              if(i < 50 || i > 59) {
              hap += i;
              }
          }
              System.out.printf("%d \n",hap);
        System.out.printf("%d번 반복되었습니다.",i);
    }
}

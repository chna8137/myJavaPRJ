package C_study;

import java.util.Scanner;

public class C_713 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        int a,b,c;

        System.out.printf("합계의 시작값 ==> ");
        a = sc.nextInt();
        System.out.printf("합계의 끝값 ==> ");
        b = sc.nextInt();
        System.out.printf("배수 ==> ");
        c = sc.nextInt();


        for(int i = 1; i < b; i++){
            if(i%4==0){
                result += i;
            }
        }
        System.out.printf("%d부터 %d까지의 %d배수의 합계 ==> %d",a,b,c,result);
    }
}

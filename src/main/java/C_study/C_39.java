package C_study;

import java.util.Scanner;

public class C_39 {
    public static void main(String[] args) {

        int a = 2,b = 3,c = 4;
        int result,mok,namugi;
        float result2;

        result = a+b-c;
        System.out.printf("%d + %d - %d = %d \n",a,b,c,result);
        result = a+b*c;
        System.out.printf("%d + %d * %d = %d \n",a,b,c,result);
        result2 = a*b/(float)c;
        System.out.printf("%d * %d / %d = %f \n",a,b,c,result2);
        mok = c / b;
        System.out.printf("%d / %d의 몫은 %d \n",c,b,mok);
        namugi = c % b;
        System.out.printf("%d / %d의 나머지는 %d \n",c,b,namugi);

    }
}

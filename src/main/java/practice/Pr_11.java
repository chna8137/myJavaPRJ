package practice;

public class Pr_11 {
    public static void main(String[]args){

        int a;

        System.out.println("-----------------------");
        System.out.println("10진수 \t16진수 \t 문자");
        System.out.println("-----------------------");

        for(a=0;a<128;a++){
                System.out.printf("  %d \t  %x \t  %c \n",a,a,a);
        }
    }
}

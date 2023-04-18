package practice;

public class Pr_19 {
    public static void main(String[]args){

        int i = 0;  //while문 전역변수로 지정

        while(i < 10){ // 조건식

        //for(i = 0; i < 10; i++){
            System.out.printf("%d \n", i);
            i++;  //증감식은 따로 입력해줘야 함
        }
    }
}

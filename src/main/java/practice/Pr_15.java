package practice;

public class Pr_15 {
    public static void main(String[] args) {

        int i, k; // i->단 k->곱하는 수?
        i= 2; //i->2단부터 시작

        for (k = 1; i < 10; k++) { //k->1~9까지 반복
            System.out.printf("%d x %d = %d\n", i , k, i*k);//2단이 9번 반복 출력됨
            if(k == 9){//k(뒷자리 숫자)가 9일때
                i++;//단이 증가됨
                k=0;//k(뒷자리 숫자)를 0으로 변경
                System.out.println();//단이 끝나면 줄바꿈
            }
        }
    }
}
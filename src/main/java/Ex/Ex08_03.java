package Ex;

import java.util.Scanner;

public class Ex08_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aa[] = new int[4];
        int hap = 0, i;

        for(i = 0; i <= 3; i++){
            System.out.printf("%d번째 숫자를 입력하새요 : ",i+1);
            aa[i] = sc.nextInt();//aa[i] -> aa배열변수에 i가 들어가면 처음에는 aa[0]이 되므로 입력값에는 aa[0]에 저장된 값이 출력됨
        }
        hap = aa[0]+aa[1]+aa[2]+aa[3];
        System.out.printf("합계 ==> %d \n", hap);
    }

}
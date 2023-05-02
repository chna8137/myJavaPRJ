package Quiz;

import java.util.Scanner;

public class Quiz_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5]; //크기 5인 int형 배열 생성
        int i = 0;
        int tmp = 0; //숫자를 이동시키기 위한 변수 tmp 선언

        for (i = 0; i < arr.length; i++) { //i에 0을 저장, i가 변수의 최대값인 5보다 크면 1씩 증가
            arr[i] = sc.nextInt(); // 숫자를 입력하는 대로 변수에 지정됨
        }
        for (i = 0; i < arr.length; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] == arr[k]) {//배열에 저장된 값을 비교하여 중복된 값이 없는지 확인
                    System.out.println("중복 된 값입니다.");//중복 시 문자 출력
                    return;//중복 값이 입력되면
                }
            }
        }

        for (i = 0; i < arr.length; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[k] < arr[i]) {
                    tmp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = tmp;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.printf("%d", arr[k]);
        }
    }
}

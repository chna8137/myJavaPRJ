package Quiz;

import java.util.Scanner;

public class Quiz_0418 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5]; //크기 5인 int형 배열 생성
        int tmp = 0; //숫자를 이동시키기 위한 변수 tmp 선언

        for (int i = 0; i < arr.length; i++) { //배열의 길이만큼 반복하여 값을 입력받음
            arr[i] = sc.nextInt(); // 입력받은 값을 배열의 i번째 위치에 저장
        }
        for (int j = 0; j < arr.length; j++) { //배열을 정렬하기 위한 반복문 생성
            for (int k = j + 1; k < arr.length; k++) {//현재 위치(j) 다음 위치부터 배열의 끝까지 반복하여 큰 값이 있는 위치를 찾음
                if (arr[k] > arr[j]) { // 변수 k의 값이 변수 i의 값보다 크면 자리를 변경한다.
                    tmp = arr[j]; //위치 변경하기 위한 코드
                    arr[j] = arr[k];
                    arr[k] = tmp;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {//k에 저장된 값을 전부 출력하기 위한 반복문
            System.out.printf("%d ", arr[k]);//변수 k에 저장된 모든값 출력
        }
    }
}
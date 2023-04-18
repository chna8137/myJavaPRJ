package practice;

import java.util.Scanner;

public class Quiz_4017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력된 값을 저장할 배열 arr과 다음 입력 위치를 가리키는 변수 index를 선언합니다.
        int[] arr = new int[5];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {// 5개의 값을 입력받습니다.
            int num = sc.nextInt();  // 입력 값을 받습니다.
            for (int k = 0; k < arr.length; k++) { // 배열의 처음부터 끝까지 반복하면서 입력 값과 배열의 값을 비교합니다.
                if (num == arr[k]) { // 입력 값이 배열의 값과 중복되면 다음 입력을 받습니다.
                    break;
                }
                if (i == k) {// 입력 값이 배열의 값과 중복되지 않으면 배열에 값을 저장하고 다음 입력 위치를 가리킵니다.
                    arr[index++] = num;
                }
            }
        }
        System.out.print("저장 된 값은 : ");// 배열에 저장된 값들을 출력합니다.
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i]);
        }
    }
}
//Scanner 클래스를 이용해 키보드로부터 입력받은 값을 처리할 수 있는 객체 sc를 생성합니다.
//
//크기가 5인 int형 배열 arr을 선언합니다.
//
//for문을 이용하여 배열의 길이만큼 반복합니다. 반복문에서 i는 배열의 인덱스를 나타냅니다.
//
//sc.nextInt()를 이용하여 키보드로부터 입력받은 값을 arr[i]에 저장합니다.
//
//이중 for문을 이용하여 현재 인덱스 이전의 인덱스와 비교하여 중복되는 값이 있는지 검사합니다. 안쪽 for문에서 k는 현재 인덱스 이전의 인덱스를 나타냅니다.
//
//if문을 이용하여 중복되는 값이 있으면 현재 인덱스를 이전으로 한 칸 되돌립니다. 이렇게 되면 중복된 값을 배열에 담지 않을 수 있습니다.
//
//break문을 이용하여 중복되는 값이 발견되면 다음 인덱스 검사를 위해 반복문을 빠져나갑니다.
//
//배열의 모든 요소를 출력합니다.
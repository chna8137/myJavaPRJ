package practice;

import java.util.Scanner;

public class Quiz_0411 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        int[] arr = new int[5];//배열 5개를 선언

        for (int k = 0; k < arr.length; k++) { //최대 배열 수를 알 수 있는 arr.length를 이용하여 k가 5보다 작을 때까지 반복
            arr[k] = sc.nextInt(); //배열 5개를 입력 받을 수 있다.
        }
        int max = arr[0]; // 최대값을 구하기 위해 기준점을 arr[0]로 선언
        int min = arr[0]; // 최소값을 구하기 위해 기준점을 arr[0]로 선언


        for (int a = 0; a < arr.length; a++) { //a가 5보다 작을 때까지 반복
            if (arr[a] >= max) { // arr[a] 가 max의 값보다 작으면 참 ex) arr[0] >= max = 100 > 0 이므로 참.
                max = arr[a]; // max에 arr[a]의 값을 대입 ex) max = 100 (위의 조건식을 통해 조건식이 참일 경우 그 값이 맥스에 저장되므로 최종적으로 가장 큰 값인 400이 max에 저장됨)
            } else if (arr[a] <= min) { //1. 100 <= 100 true 2. 200<=100 false 3. 100<=100 true 4. 300<=100 false 5. 400<=100 false
                min = arr[a]; // 위의 조건식 중 100만이 참이므로 min에는 100이 저장됨
            }
        }
        int hap = 0; //배열 값의 합계를 저장할 변수
        int avg = arr[0];  //평균을 구하기 위한 int avg = arr[10] -> int avg에 배열 0에 위치한 숫자를 저장
        for (int b = 0; b < arr.length; b++) {
            hap += arr[b]; //hap에 arr[b]에 저장된 값을 모두 합산하여 저장
            avg = hap / 5; // avg에 hap값을 5로 나눈 (평균)값을 저장
        }
        System.out.printf("가장 큰 값 : %d / 가장 작은 값 : %d / 평균 값 : %d \n", max, min, avg);//최대값, 최소깂, 평균값 츨력
    }

}

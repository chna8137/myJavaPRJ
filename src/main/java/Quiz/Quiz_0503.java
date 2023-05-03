package Quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz_0503 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        int i;

        for (i = 1; i <= 5; i++) {// 5번 반복하는 for문
            list.add(sc.nextInt());// 키보드로부터 정수를 입력받아 list에 추가
        }
        for (int j = 0; j < 5; j++) {
            for (int k = j+1; k < list.size(); k++) {//list.size()만큼 반복하는 for문
                if(list.get(j)==list.get(k)){ // list에서 중복된 값이 있다면
                    list.remove(k);// 해당 값을 제거
                }
            }

        }
        System.out.println(list);// list 출력
    }
}

import java.util.Scanner;

public class Ex09_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.print("문자열 입력 ==> ");
        str = sc.nextLine();

        System.out.print("출력 문자열 ==> ");
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == 'o'){ //영어 소문자에 o가 있으면
//                System.out.printf("%c", '$'); //$로 바꿔주고
//            }else{//아니면
//                System.out.printf("%c ", str.charAt(i));//그냥 그대로 출력
//            }
//        }
        System.out.println("내가 사용한 함수 : " + str.replaceAll("o","Q"));// 이 함수 많이 쓰니까 알아둘것 all 모든 열에서 찾아봄
    }
}
// 위에 있는 for 문을 사용한 것과 동일한 내용으로 출력됨 그러나 훨씬 짧게 코딩 가넝
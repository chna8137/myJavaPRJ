import java.util.Scanner;

public class Ex09_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.print("문자열 입력 ==> "); //안녕하세요 입력
        str = sc.nextLine(); // str에 안녕하세요 저장

        System.out.print("출력 문자열 ==> ");

        if(!str.startsWith("(")){//!부정 즉 반대 (로 시작하지 않으면!(시작점 부터 시작)
            System.out.printf("(");//(를 출력
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.printf("%c", str.charAt(i));
        }
        if(!str.endsWith(")")){ //!부정 즉 반대 )로 끝나지 않으면!(끝점에서 부터 시작)
            System.out.printf(")");//)를 출력
        }
    }
}

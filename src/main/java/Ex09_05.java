import java.util.Scanner;

public class Ex09_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, strRep, strSub, strAry[], strRep2;

        System.out.print("문자열을 입력하세요 : ");
        str = sc.nextLine();

        strRep = str.replace(" ", "$");//replace 이 단어와 매칭되는 경우만 바꾼다.
        strRep2 = str.replaceAll("\\s","\\$");//regex-정규식 구조를 바꾸려는 경우에는 replaceAll을 많이 사용함(Ex 이메일)
        //위의 \\s는 문자열의 의미가 아닌 space 즉 공백을 의미한다. 특수문자는 \\뒤에 쓴다.
        strSub = str.substring(3,8);
        strAry = str.split(" ");

        System.out.println("입력 문자열 ==> " + str);
        System.out.println("바꾼 문자열 ==> " + strRep);
        System.out.println("바꾼 문자열 ==> " + strRep2);
        System.out.println("일부 문자열 ==> " + strSub);
        for (int i = 0; i < strAry.length; i++) {
            System.out.println("분리한 문자열" + i + " ==>" + strAry[i]);
        }
    }
}

public class Ex09_06 {
    public static void main(String[] args) {
        String str = "  한글  ABCD    efgh    ";

        System.out.println("원 문자열 ==> [" + str + "]");
        System.out.println(" 대문자로 ==> [" + str.toUpperCase() + "]");//대문자로 바꾼다.
        System.out.println(" 소문자로 ==> [" + str.toLowerCase() + "]");//소문자로 바꾼다.
        System.out.println(" 공백제거 ==> [" + str.trim() + "]");//앞 뒤 공백을 제거한다.(그러나 중간의 공백을 지워주지는 않는다.)
    }
}

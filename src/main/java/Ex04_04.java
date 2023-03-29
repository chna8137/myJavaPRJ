public class Ex04_04 {
    public static void main(String[] args) {
        int a = 10, b;

        b = a++; //a++ 제일 마지막에 연산
        System.out.printf(" %d \n", b);
        //현재 b = 10 a = 11 상태
        b = ++a;//b=10 a = 11 + 1=12 -> b = 12
        System.out.printf(" %d \n", b);
    }
}

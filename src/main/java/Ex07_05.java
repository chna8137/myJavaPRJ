public class Ex07_05 {
    public static void main(String[] args) {
        int a = 100;

        while (a == 200) { //while은 조건이 맞을때만 작동
            System.out.printf("while문 내부에 들어 왓습니다.\n");
        }
        do {//do - while 문은 무조건 한번은 작동한다.
            System.out.printf("do - while문 내부에 들어 왔습니다.\n");
        } while (a == 200);
    }
}

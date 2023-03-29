public class Ex06_07 {
    public static void main(String[] args) {
        int hap = 0; //=이 없으면 메모리에 올라가지 않음 -> 현재 메모리에 올라가지 않음
        int i;

        for (i = 1; i <= 10; i++) {
            hap += i;
        }
        System.out.printf(" 1에서 10까지의 합: %d \n", hap);
    }
}

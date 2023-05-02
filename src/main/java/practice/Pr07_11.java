package practice;

public class Pr07_11 {
    public static void main(String[] args) {

        int hap = 0;
        int i;

        myLabel:
        for (; ; ) { //무한반복
            for (i = 1; i <= 100; i++) {
                hap += i; //hap에 hap + i을 한 값을 저장
                if (hap > 2000) {
                    System.out.printf("%d \n", hap);
                    hap = 0;
                    break myLabel;
                }

            }
            System.out.printf("아직도 반복 중...\n");
        }
    }
}


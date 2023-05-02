package Ex;

public class Ex07_10 {
    public static void main(String[] args) {

        int hap = 0;
        int a;

        for(a = 1; a <= 100; a++){
            if(a % 3 == 0){
                continue;

            }
                hap += a;
        }
        System.out.printf("1~100까지의 합(3의 배수 제외) : %d \n",hap);
    }
}

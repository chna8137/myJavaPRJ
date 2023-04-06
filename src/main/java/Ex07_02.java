public class Ex07_02 {
    public static void main(String[] args){

        int hap = 0; // 합한 값을 저장할 변수 지정
        int i = 1;

        while(i <= 10){ // i가 10보다 작거나 같을 때 1 2 3....
            hap += i; // hap에 hap + i 값을 저장 hap = 1 1+2=3 3+3....
            i++; // i을 1씩 증가 1+1 2+1 4....
        }
        System.out.printf("1에서 10까지의 합 : %d \n", hap);
    }
}
package practice;

public class Ex08_05 {
    public static void main(String[] args) {

        int[] aa = new int[100];
        int[] bb = new int[100];
        int i;

        for(i = 0; i < aa.length; i++){
            aa[i] = i * 2;
        }
        for(i = 0; i < bb.length; i++){
            bb[i] = 99-i;
        }
        System.out.printf("bb[0]는 %d, bb[99]는 %d가 입력됨 \n", bb[0], bb[99]);
    }
}

package practice;

public class Array3 {
    public static void main(String[] args) {

        int[][][] arr = new int[10][10][10];
        int i, j, k;
        int index = 1; // 1부터 1000까지 증가할 index

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                for (k = 0; k < arr.length; k++) {
                    arr[i][j][k] = index++;
                }
            }
        }
        int hap = 0;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                for (k = 0; k < arr.length; k++) {
                    hap += arr[i][j][k];
                }
            }
        }
        System.out.printf("1~1000 까지의 합계 : %d \n", hap);
    }
}

package practice;

public class Pr_14 {
    public static void main(String[]args){

        int i, k;

        for(i = 2, k = 1; i <= 9; k++){
            System.out.printf("%d x %d = %d \n", i, k, i*k);
            if(k == 9){
                i++;
                k=0;
                System.out.println();
            }
        }
    }
}

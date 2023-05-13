package jeongseok;

class Data_1 {
    int value; //컴파일러에 의해 기본 생성자 자동 생성
}

class Data_2 {
    int value;

    Data_2(int x) { //매개 변수다 있는 생성자
        value = x;
    }
}

public class jeongseok06_11 {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();

    }

}

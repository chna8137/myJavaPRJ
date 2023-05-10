public class Ex10_04 {
    public static void main(String[] args) {
        int a = 100, b = 0;
        int result;
        try {
            if (b == 0) {
                throw new Exception("0으로 나누려고요? 안됩니다.");
                //throw던저려 new 메모리에 올려라 Exception객체를()안에 들은 메시지가 들은
                //()안에 메세지가 들은 Exception 객체를 메모리에 올리고 에러를 던져라
            }
            result = a / b;
        }catch (Exception e){//위의 throw new 뒤에 선언한 것과 동일하게 입력해야함
            System.out.print("발생 오류 ==> ");
            System.out.println(e.getMessage());
        }
    }
}


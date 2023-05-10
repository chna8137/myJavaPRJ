public class Ex10_01 {
    public static void main(String[] args) {
        int[] aa = new int[3]; //배열 0,1,2 생성
        try {
            aa[2] = 100 / 0; // 0으로 나눌 수 없으므로 오류
            aa[3] = 100; //배열 0,1,2까지만 있는데 배열 자리 3에 넣으려고 하니 오류남
        } catch (ArrayIndexOutOfBoundsException e) {//오류를 잡아라 catch
            //<- Array 어쩌구 외울 생각말고 이런게 있다는 것 정도만 알면 됨 나중에 다른 거 배울 거임
            System.out.println("배열의 첨자가 배열 크기 보다 커요 ~~");
            System.out.println("오류 메시지 : " + e);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눠서 에러가 발생해요");
            System.out.println("오류 메시지 : " + e);
        } catch (Exception e) {//자바의 모든 조상임 모든 에러를 Exception으로 잡을 수 있다.
            System.out.println("자바에서 발생되는 모든 에러를 다 잡을 수 있어요");
            System.out.println("오류 메시지 : " + e);
        } finally {//finally를 많이 씀
            System.out.println("정상동작하던지, 오류가 나던지 finally는 무조건 실행됩니다.");
        }
    }
}



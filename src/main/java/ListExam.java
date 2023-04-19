import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        //list 객체에 데이터 추가하기
        list.add("이협건");
        list.add("홍길동");
        list.add("임꺽정");
        list.add("고길동");
        //List에 저장된 데이터 수
        int listSize = list.size();

        System.out.println("저장된 데이터 수 : " + listSize);
        System.out.println("1세대 반복문"); // 반드시 반복의 횟수를 알고 있어야 사용 가능

        for (int i = 0; i < listSize; i++) { //개수를 세려면 배열의 개수를 세고, 출력을 위해 개수를 세기 때문에
            System.out.println("이름 : " + list.get(i));//배열의 2배를 세야함
        }
        System.out.println("2세대 반복문");//1세대 반복문의 단점인 반드시 반복 횟수를 알고 있어야 한다는 문제점을 개선

        for (String name : list) {//for(리스트 배열 안에 있는 값을 순서대로 꺼내라)
            System.out.println("이름 : " + name);
        }
        System.out.println("3세대 반복문");//2세대보다 코딩해야하는 줄이 감소, 람다식 적용, 자바 1.8부터 사용 가능
//
        list.forEach(name -> System.out.println("name : " + name));

        System.out.println("4세대 반복문");//3세대에 비동기식 처리방법 적용, 처리 완료가 누가 먼저 될지 알 수 없다는 단점
        //여러개의 스레드를 사용함 공유가 안된다는 단점이 있음, 속도는 가장 빠름, 모든 경우에 적용할 수 없음
        list.parallelStream().forEach(name -> System.out.println("name : " + name));

        //while 반복문 - 1.5세대 - for 반복문 1세대보다 처리 속도가 빠름
        //자바 1.7까지 가장 많이 쓰던 반복문
        //단점 : 코드가 길어짐
        System.out.println("1.5세대 반복문");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) { //forEach문과 돌아가는 방식이 동일. 값이 있냐 없냐로 참, 거짓을 구분
            String name = it.next();
            System.out.println("이름 : " + name);
        }
    }
}

import java.util.*;

public class ListMapExam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //최종 저장되는 list 구조
        List<Map<String, String>> list = new ArrayList<>();

        //list 구조 안에 저장 될 map 객체
        Map<String, String> map = null;

        for(int i = 0; i < 3; i++){

            System.out.print("이름 : ");
            String name = sc.next();

            System.out.print("이메일 : ");
            String email = sc.next();

            System.out.print("부서 :");
            String dept = sc.next();

            map = new HashMap<>();

            map.put("name", name);
            map.put("email", email);
            map.put("dept", dept);

            list.add(map);

            map = null;
        }

        int listSize = list.size();

        System.out.println("저장된 데이터 수 : " + listSize);

        System.out.println("1세대 반복문");

        for(int i = 0; i < listSize; i++){
            Map<String, String> rMap = list.get(i);

            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));

            rMap = null;
        }
        System.out.println("2세대 반복문");

        for(Map<String, String> rMap : list) {
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));
        }
        System.out.println("3세대 반복문");

        list.forEach(rMap -> {
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));
        });
        System.out.println("4세대 반복문");

        list.parallelStream().forEach(rMap -> {
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));
        });
        System.out.println("1.5세대 반복문");

        Iterator<Map<String, String>> it = list.iterator();

        while (it.hasNext()){
            Map<String, String> rMap = it.next();

            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));

            rMap = null;
        }
    }
}

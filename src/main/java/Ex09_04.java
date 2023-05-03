public class Ex09_04 {
    public static void main(String[] args) {
        String str = "Java를 공부하는 중, Java는 재밌어요. ^^";

        System.out.println("문자열 ==> " + str);

        System.out.print("제일 처음 나오는 Java 위치 ==> ");
        System.out.println(str.indexOf("Java"));
        System.out.print("마지막에 나오는 Java 위치 ==> ");
        System.out.println(str.lastIndexOf("kava"));
    }
}
//indexOf는 해당 문자가 있는지 확인용으로 많이 씀 or 해당 문자가 어디에 위치하는지 확인할 때
//indexOf - 문장의 앞에서부터 위치를 찾는다. 0,1,2,3,4...
//lastIndexOf - 문장의 끝에서부터 위치를 찾는다.
//찾는 값이 존재하지 않으면 -1이라는 값을 뱉어냄

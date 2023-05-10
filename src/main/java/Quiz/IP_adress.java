package Quiz;

public class IP_adress {
    public static void main(String[] args) {
        String log = "123.123.123.123 - - [12/Apr/2018:17:03:50 +0900] \"GET /api/aaaa HTTP/1.1\" 200 34 1468 \"https://m.naver.com\" \"Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E216 NAVER(inapp; search; 580; 8.6.3; 7)\"";
        //IP만 출력하기
        //호출날짜와 시간만 출력하기
        //split 이용하기

        String[] ip = log.split(" ");
        System.out.println("IP 주소 : " + ip[0]);
        System.out.println("빠밤  : " + ip[5]);

        ip = log.split(" ");
        System.out.println("호출날짜와 시간 : " + ip[3]);

        String replace;

        replace = log.replace("Apr","Oct");
        System.out.println("짜란 : " + replace);

        String sub;
        System.out.println(log.indexOf("Apr"));
        sub = log.substring(24,27);
        System.out.println("따라란 : " + sub);



    }
}

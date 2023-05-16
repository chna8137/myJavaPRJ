package practice;

class Pet2 {
    String type;
    int age;

    void move() {
        System.out.println(this.type + "가 움직입니다.");
    }

    int getAge() {
        return this.age;
    }
}

public class Problem_29 {
    public static void main(String[] args) {
        Pet2 pet1 = new Pet2();
        pet1.type = "강아지";
        pet1.age = 8;

        Pet2 pet2 = new Pet2();
        pet2.type = "고양이";
        pet2.age = 13;

        pet1.move();
        pet2.move();

        System.out.println(pet1.type + "는" + pet1.age + "개월입니다.");
        System.out.println(pet2.type + "는" + pet2.age + "개월입니다.");
    }
}

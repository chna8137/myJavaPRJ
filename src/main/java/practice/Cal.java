package practice;

class Parent {
    public int cal(int a, int b) {
        return a + b;
    }
}

class Child extends Parent {
    @Override
    public int cal(int a, int b) {
        return a * b;
    }
}

public class Cal {
    public static void main(String[] args) {
        Parent myChild = new Child();   //참조변수를 부모로 만들어도 그 안에 있는 실제 객체의 method 를 따라감
        System.out.println(myChild.cal(5, 6));
    }
}

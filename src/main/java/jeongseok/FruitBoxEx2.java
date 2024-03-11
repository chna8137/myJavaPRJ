package jeongseok;

import java.util.ArrayList;

class fruit implements Eatable {
    public String toString() {return "fruit";}
}
class apple extends fruit {public String toString() {return "apple";}}
class Grape extends fruit {public String toString() {return "Grape";}}
class toy {public String toString() {return "Toy";}}

interface Eatable {}
public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<fruit> fruitBox = new FruitBox<fruit>();
        FruitBox<apple> appleBox = new FruitBox<apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//        FruitBox<Grape> grapeBox = new FruitBox<Apple>(); // 에러, 타입 불일치
//        FruitBox<Toy> toyBox = new FruitBox<Toy>(); // 에러

        fruitBox.add(new fruit());
        fruitBox.add(new apple());
        fruitBox.add(new Grape());
        appleBox.add(new apple());
//        appleBox.add(new Grape()); // 에러. Grape는 Apple의 자손이 아님
        grapeBox.add(new Grape());

        System.out.println("fruitBox-"+fruitBox);
        System.out.println("appleBox-"+appleBox);
        System.out.println("grapeBox-"+grapeBox);
    } // main
}

class FruitBox<T extends fruit & Eatable> extends box<T> {}

class box<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) {list.add(item);}
    T get(int i) {return list.get(i);}
    int size() {return list.size();}
    public String toString() {return list.toString();}
}
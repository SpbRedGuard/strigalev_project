import java.sql.SQLOutput;
import java.util.*;



public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("задание 1\n");

        try {
            List<String> strings = new ArrayList<String>();
            List<Integer> integers = new ArrayList<Integer>();

            strings.add("Фамилия");
            strings.add("Имя");
            strings.add("Отчество");
            strings.add("Дата рождения");
            strings.add("Пол");
            integers.add(1);
            integers.add(2);
            integers.add(3);
            integers.add(4);
            integers.add(5);

            System.out.println("Перед swap strings: " + strings);
            System.out.println("Перед swap integers: " + integers + "\n");

            // смена мест в массиве

            Collections.swap(strings, 0, 3);
            Collections.swap(integers, 2, 4);

            // выводим после перестановки

            System.out.println("После swap strings: " + strings);
            System.out.println("После swap integers: " + integers + "\n");

        } catch (IndexOutOfBoundsException e) {
            System.out.println("\nException thrown : " + e);
        }

        System.out.println("задание 2\n");

        Integer[] arr = {1,2,3,4,5};

        ArrToArrList.method(arr);

        Box<Orange> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();
        Box<Apple> box3 = new Box<>();
        Box<Apple> box4 = new Box<>();

        System.out.println("\nзадание 3\n");

        box1.addFruit(new Orange(),4);
        box2.addFruit(new Orange(),15);
        box3.addFruit(new Apple(),6);
        box4.addFruit(new Apple(),8);

        System.out.println("считаем вес коробки: \n");

        System.out.println("Box1: " + box1.getWeight());
        System.out.println("Box2: " + box2.getWeight());
        System.out.println("Box3: " + box3.getWeight());
        System.out.println("Box4: " + box4.getWeight());

        System.out.println("\nсравнение коробок: \n");

        System.out.println("Box1 равна box3: " + box1.compare(box3));
        System.out.println("Box2 равна box4: " + box2.compare(box4));

        System.out.println("\nпересыпаем фрукты: \n");

        box1.pourTo(box2);
        box3.pourTo(box4);

        System.out.println("Box1: " + box1.getWeight());
        System.out.println("Box2: " + box2.getWeight());
        System.out.println("Box3: " + box3.getWeight());
        System.out.println("Box4: " + box4.getWeight());

        System.out.println("\nснова добавили: \n");

        box1.addFruit(new Orange(),20);
        box3.addFruit(new Apple(),5);

        System.out.println("Box1: " + box1.getWeight());
        System.out.println("Box3: " + box3.getWeight());
    }


}


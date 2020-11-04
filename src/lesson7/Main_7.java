package lesson7;

public class Main_7 {
    public static void main(String[] args) {
/*1. Расширить задачу про котов и тарелки с едой
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20)
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true
4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку */

        /*Cat cat1 = new Cat("Leonard",15, true);
        Cat cat2 = new Cat("Valter",20,true );
        Cat cat3 = new Cat("Goliaf",25, true);*/

        Cat[] cats = {new Cat("Leonard", 50, true), new Cat("Valter", 50, true), new Cat("Goliaf", 25, true), new Cat("Rafael", 30, true), new Cat("Archebald", 10, true)};


        Plate plate = new Plate(150);

        /*cat1.eat(plate);
        cat1.info();
        cat2.eat(plate);
        cat2.info();
        cat3.eat(plate);
        cat3.info();
        plate.addFood(20);
        plate.info();
        cat3.eat(plate);
        cat3.info();*/

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
        System.out.println(plate);
        plate.addFood(20);
        plate.info();
        cats[3].eat(plate);
        cats[3].info();
    }
}
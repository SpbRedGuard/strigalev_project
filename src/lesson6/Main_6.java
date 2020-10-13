package lesson6;

public class Main_6 {
    public static void main(String[] args) {

        //чтобы реализовать подсчёт нужно создать массив из всех этих животных

      Cat cat1 = new Cat("Cat","Leonard", 190);
        Cat cat2 = new Cat("Cat","Rafael", 170);
        Cat cat3 = new Cat("Cat","Socrat",130);
        Dog dog1 = new Dog("Dog","Rudolf",360, 6);
        Dog dog2 = new Dog("Dog","Goliaf",400, 8);
        Dog dog3 = new Dog("Dog","Valter",500, 10);

        cat1.run(); cat1.notSwim();
        cat2.run(); cat2.notSwim();
        cat3.run(); cat3.notSwim();
        dog1.run(); dog1.swim();
        dog2.run(); dog2.swim();
        dog3.run(); dog3.swim();

        Animals [] animalsArr = new Animals [6];
        animalsArr [0] = new Cat ("Cat","Leonard", 190);
        animalsArr [1] = new Cat ("Cat","Rafael", 170);
        animalsArr [2] = new Cat ("Cat","Socrat",130);
        animalsArr [3] = new Dog ("Dog","Rudolf",360, 6);
        animalsArr [4] = new Dog ("Dog","Goliaf",400, 8);
        animalsArr [5] = new Dog ("Dog","Valter",500, 10);

       int countAnimals = 0;
       int countCats = 0;
       int countDogs = 0;

        for (int i=0; i < animalsArr.length; i++) {
            if (animalsArr[i].getType() == "Cat") {
                countCats++;
            }
             if (animalsArr[i].getType() == "Dog") {
                 countDogs++;
             }
             if (animalsArr[i].getType() != "Cat" || animalsArr[i].getType() != "Dog") {
                 countAnimals++;
             }

        }   System.out.println("Количество котов = " + countCats);
            System.out.println("Количество собак = " + countDogs);
            System.out.println("Количество животных = " + countAnimals);
    }
}



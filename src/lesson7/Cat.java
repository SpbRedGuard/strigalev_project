package lesson7;

public class Cat {
    private String name; // имя
    private int appetite; //аппетит
    private boolean satiety; //сытость

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = true;
    }

    public String getName() {
        return name;
    }

    /*public void eat(Plate plate) {
        System.out.println("Cat " + name + " кушает..");
        plate.decreaseFood(appetite);
    }*/
    void eat(Plate plate) {
        System.out.println("Cat " + name + " кушает..");
        if (satiety && plate.decreaseFood(appetite))
            satiety = false;
    }
        void info () {
            String isSatiety = !satiety ? "сыт" : "голоден";
            System.out.println(name + ": " + isSatiety);
        }
    }


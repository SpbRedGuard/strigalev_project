package lesson6;

public class Cat extends Animals{
      /*  public Cat (String type, String name, int distanceRun) {
            this.type = type;
            this.name = name;
            this.distanceRun = distanceRun;

        }*/
    private static int animalCount;

    static {
        animalCount = 0;
    }

    public Cat(String name) {
        super("Кот", name, 200, 2, 0);

        animalCount++;
    }

    public Cat(String name, int dispersionPercent) {
        super("Кот", name, 200, 2,
                0, dispersionPercent);

        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
    }


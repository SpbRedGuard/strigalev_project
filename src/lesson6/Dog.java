package lesson6;

public class Dog extends Animals {
    /* public Dog (String type, String name, int distanceRun, int distanceSwim) {
         this.type = type;
         this.name = name;
         this.distanceRun = distanceRun;
         this.distanceSwim = distanceSwim;
         } */
    public Dog(String name) {
        super("Собака", name, 1000, 1, 20);
    }
}

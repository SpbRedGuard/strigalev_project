package lesson6;


public class Animals {
    String name;
    String type;
    int distanceRun;
    int distanceSwim;


    public void run () {
         System.out.println(name + " пробежал " + distanceRun + " метров");
    }

    public void swim () {
         System.out.println(name + " проплыл " + distanceSwim + " метров");
    }

    public void notSwim () {
         System.out.println(name + " не умеет плавать");
    }

    String getType() {
         return type;
    }
}

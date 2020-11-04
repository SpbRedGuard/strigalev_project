package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
        boolean decreaseFood (int amount) {
        if (amount < 0 || food-amount<0){
            return false;
        }
        food -= amount;
        return true;
    }

    void addFood(int food) {
        this.food += food;
    }

    void info() {
        System.out.println("в тарелку добавили: " + food + " еды");
    }

    @Override
    public String toString() {
        return "В тарелке осталось {" +
                "еды " + food +
                "}";
    }
}

package stage2_lesson1;

public class Human extends Team implements Competition {

    private boolean onDistance = true;

    public Human(String name, int maxRunDistance, int maxJumpHeight) {
        super(name, 2000, 2);
    }



    @Override
    public void run(int dist) {
        if (dist <= getMaxRunDistance()) {
            System.out.println(name + " успешно преодолел " + dist + " м");
        } else {
            System.out.println(name + " столько бежать не может ");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= getMaxJumpHeight()) {
            System.out.println(name + " успешно преодолел " + height + " м");
        } else {
            System.out.println(name + " столько прыгать не может ");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.printf("%s %b\n", name, onDistance);
    }


}

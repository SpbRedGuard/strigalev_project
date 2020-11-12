package stage2_lesson1;

public class Treadmill implements Obstacle{
    private int dist;

    public  Treadmill (int dist){
        this.dist = dist;
    }

    @Override
    public void doIt(Competition c) {
        c.run(dist);
    }
}

package stage2_lesson1;

public class Wall implements Obstacle{
    private int height;

    public  Wall (int height){
        this.height = height;
    }

    @Override
    public void doIt(Competition c) {
        c.jump(height);
    }
}

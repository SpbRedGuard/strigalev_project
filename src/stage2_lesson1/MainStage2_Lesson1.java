package stage2_lesson1;

public class MainStage2_Lesson1 {
    public static void main(String[] args) {

        Competition[] competitions = {new Cat("Valter", 200, 2),
                new Human("Kirill", 2000, 1),
                new Robot("Mech", 5000, 5)};


        Obstacle[] obstacles = {new Treadmill(300),
                new Wall(2)};
        for (Competition c : competitions) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()) {
                    break;
                }
            }
        }
        for (Competition competition : competitions){
            competition.info();
        }
    }
}

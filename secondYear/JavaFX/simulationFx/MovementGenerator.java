package simulationFx;
import java.util.Random;

public class MovementGenerator {
	private static int movement;
    private static int spawnPoint;
    Random rand = new Random();


    MovementGenerator(){
        movement = 0;
        spawnPoint = 0;
    }

    public static int getMovement() {
        return movement;
    }

    public static void setMovement(int movement) {
        MovementGenerator.movement = movement;
    }

    public static int getSpawnPoint() {
        return spawnPoint;
    }

    public static void setSpawnPoint(int spawnPoint) {
        MovementGenerator.spawnPoint = spawnPoint;
    }

    public int velocity(){
        movement = rand.nextInt(1);
        if (movement == 1) {
            movement = rand.nextInt(10);
        }
        else if (movement == 0) {
            movement = (rand.nextInt(10)*-1);
        }
        return movement;
    }

    public int position(){
        return spawnPoint = rand.nextInt(900);

    }

}

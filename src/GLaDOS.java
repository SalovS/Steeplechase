import java.util.Random;

public class GLaDOS {
    Random random = new Random();
    private double maxHeight;
    private double maxLength;

    GLaDOS(double maxHeight, double maxLength){
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
    }

    public double getLength(){
        return random.nextDouble() * maxLength;
    }

    public double getHeight(){
        return random.nextDouble() * maxHeight;
    }

    public Obstacle[] getTests(int count) {
        Obstacle[] obstacles = new Obstacle[count];
        for(int i = 0; i < obstacles.length; i++){
            if(i % 2 == 0){
                obstacles[i] = new Treadmill(getLength());
            }else{
                obstacles[i] = new Barrier(getHeight());
            }
        }
        return obstacles;
    }
}

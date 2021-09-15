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
}

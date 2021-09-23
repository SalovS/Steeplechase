public class Treadmill implements Obstacle {
    private double length;
    Treadmill(double length){
        this.length = length;
    }

    public double getValue(){
        return length;
    }
}

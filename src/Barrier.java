public class Barrier implements Obstacle {
    private double height;
    Barrier(double height){
        this.height = height;
    }

    public double getValue(){
        return height;
    }
}

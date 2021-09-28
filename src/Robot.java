public class Robot implements Runner{
    private double maxHeight = 30;
    private double stamina = 2000;
    private boolean canMove;
    private String name = "робот";

    Robot(double stamina, double maxHeight, String name){
        this.stamina = stamina;
        this.maxHeight = maxHeight;
        this.name = name;
        canMove = true;
    }

    Robot(){
        canMove = true;
    }

    public double getMaxHeight(){
        return maxHeight;
    }

    public double getStamina(){
        return stamina;
    }

    public boolean getStatus(){
        return canMove;
    }

    public void setStamina(double stamina){
        this.stamina = stamina;
    }

    public void setStatus(boolean canMove){
        this.canMove = canMove;
    }

    public String getName(){
        return name;
    }
}

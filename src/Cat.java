public class Cat implements Runner {
    private double maxHeight = 230;
    private double stamina = 3000;
    private boolean canMove;
    private String name = "кот";

    Cat(double stamina, double maxHeight, String name){
        this.stamina = stamina;
        this.maxHeight = maxHeight;
        this.name = name;
        canMove = true;
    }

    Cat(){
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

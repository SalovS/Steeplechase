public class Treadmill implements Obstacle {
    private double length;
    Treadmill(double length){
        this.length = length;
    }

    public void overcome(Runner runner){
        if(runner.getStatus()){
            if(runner.getStamina() >= length){
                runner.setStamina(runner.getStamina() - length);
                System.out.printf("%s пробежал\n",runner.getName());
            }else{
                runner.setStatus(false);
                System.out.printf("%s устал\n",runner.getName());
            }
        }
    }
}

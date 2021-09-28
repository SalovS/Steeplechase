public class Barrier implements Obstacle {
    private double height;
    Barrier(double height){
        this.height = height;
    }

    public void overcome(Runner runner){
        if(runner.getStatus()){
            if(runner.getMaxHeight() >= height){
                if(runner.getStamina() >= height * height / 2) {
                    runner.setStamina(runner.getStamina() - height * height / 2);
                    System.out.printf("%s сделал прыжок\n",runner.getName());
                }else {
                    runner.setStatus(false);
                    System.out.printf("%s устал\n",runner.getName());
                }
            }else {
                runner.setStatus(false);
                System.out.printf("%s не смог перепрыгнуть\n",runner.getName());
            }
        }
    }
}

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

    @Override
    public void jump(double height) {
        if(canMove){
            if(maxHeight >= height && stamina >= height * height / 2){
                System.out.printf("%s сделал прыжок\n", name);
                stamina -= height * height / 2;
            }else{
                System.out.printf("%s бип-бип\n", name);
                canMove = false;
            }
        }
    }

    @Override
    public void run(double length) {
        if(canMove){
            if(stamina >= length){
                System.out.printf("%s пробежал\n", name);
                stamina -= length;
            }else{
                System.out.printf("%s разряжен\n", name);
                canMove = false;
            }
        }
    }
}

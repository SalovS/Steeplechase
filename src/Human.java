public class Human implements Runner{
    private double maxHeight = 60;
    private double stamina = 5000;
    private boolean canMove;
    private String name = "человек";

    Human(double stamina, double maxHeight, String name){
        this.stamina = stamina;
        this.maxHeight = maxHeight;
        this.name = name;
        canMove = true;
    }
    Human(){
        canMove = true;
    }


    public void jump(Barrier barrier) {
        double height = barrier.getValue();
        if(canMove){
            if(maxHeight >= height && stamina >= height * height / 2){
                System.out.printf("%s сделал прыжок\n",name);
                stamina -= height * height / 2;
            }else{
                System.out.printf("%s : высоко\n", name);
                canMove = false;
            }
        }
    }

    public void run(Treadmill treadmill) {
        double length = treadmill.getValue();
        if(canMove){
            if(stamina >= length){
                System.out.printf("%s пробежал\n",name);
                stamina -= length;
            }else{
                System.out.printf("%s устал\n", name);
                canMove = false;
            }
        }
    }
}

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

    public void jump(Barrier barrier) {
        double height = barrier.getValue();
        if(canMove){
            if(maxHeight >= height && stamina >= height * height / 2){
                System.out.printf("%s сделал прыжок\n",name);
                stamina -= height * height / 2;
            }else{
                System.out.printf("%s : Мяу!\n", name);
                canMove = false;
            }
        }
    }

    public void run(Treadmill treadmill) {
        double length = treadmill.getValue();
        if(canMove){
            if(stamina >= length){
                System.out.printf("%s пробежал\n", name);
                stamina -= length;
            }else{
                System.out.printf("%s заснул\n", name);
                canMove = false;
            }
        }
    }

    public void overcome(Test test) {
        Treadmill treadmill = new Treadmill(1);
        if(treadmill.getClass().equals(test.getClass())){
            run((Treadmill) test);
        }else{
            jump((Barrier) test);
        }
    }
}

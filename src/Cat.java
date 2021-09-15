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

    @Override
    public void jump(double height) {
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

    @Override
    public void run(double length) {
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
}

public class Main {
    public static void main(String[] args){
        Runner[] runners = new Runner[3];
        runners[0] = new Human(5000, 60, "Пётр");
        runners[1] = new Cat(3000, 230,"Васька");
        runners[2] = new Robot(4000, 30,"Atlas");

        GLaDOS tester = new GLaDOS(32, 300);

        Obstacle[] obstacles = tester.getTests(21);

        for(int i = 0; i < obstacles.length; i++){
            System.out.printf("__________Препятствие № %d__________\n",i+1);
            for(int j = 0; j < runners.length; j++) {
                runners[j].overcome(obstacles[i]);
            }
        }

    }
}

public interface Runner {
    default void overcome(Obstacle obstacle) {
        if(obstacle instanceof Treadmill){
            run((Treadmill)obstacle);
        }else if(obstacle instanceof Barrier){
            jump((Barrier) obstacle);
        }else{
        }
    }
    void run(Treadmill treadmill);
    void jump(Barrier barrier);
}

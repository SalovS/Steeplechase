public interface Runner {
    public default double getMaxHeight(){
        return 0;
    }

    public default double getStamina(){
        return 0;
    }

    public default boolean getStatus(){
        return false;
    }

    public default void setStamina(double stamina){
    }

    public default void setStatus(boolean canMove){
    }

    public default String getName(){
        return "";
    }
}

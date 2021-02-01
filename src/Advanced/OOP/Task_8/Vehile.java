package Advanced.OOP.Task_8;

public interface Vehile {

    Integer getMaxSpeed();
    Integer move();

    default void stop()
    {}

}

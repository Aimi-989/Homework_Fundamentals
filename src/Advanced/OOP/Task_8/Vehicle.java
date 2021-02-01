package Advanced.OOP.Task_8;

public interface Vehicle {

    Integer getMaxSpeed();
    Integer move();

    default void stop()
    {}

}

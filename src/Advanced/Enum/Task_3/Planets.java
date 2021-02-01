package Advanced.Enum.Task_3;

public enum Planets {
    MERCURY("Small, hot planet", -2, 24397),
    VENUS("Misty", -1, 60518),
    EARTH("Life is here", 0, 6371),
    MARS("", 1, 33895),
    JUPITER("", 2, 69911),
    SATURN("", 3, 58232),
    URANUS("", 4, 25362),
    NEPTUNE("", 5, 25362);

    String description;
    Integer distance;
    Integer size;

    Planets(String name, Integer distance, Integer size) {
        this.description = name;
        this.distance = distance;
        this.size = size;
    }

    Integer distanceFromEarth() {
        return this.distance;
    }

    Integer size() {
        return this.size;
    }


    @java.lang.Override
    public String toString() {
        return String.format(description + distance + size);
    }

}

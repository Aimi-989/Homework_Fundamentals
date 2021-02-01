package Advanced.Enum;

public enum Planets {
    MERCURY("Small, hot planet", -2),
    VENUS("Misty", -1),
    EARTH("Life is here", 0),
    MARS("", 1),
    JUPITER("", 2),
    SATURN("", 3),
    URANUS("", 4),
    NEPTUNE("", 5);

    String description;
    Integer distance;

    Planets (String parameterName, Integer distance){
        this.description = parameterName;
        this.distance = distance;
    }

    Integer distanceFromEarth (){
        return this.distance;
    }

}

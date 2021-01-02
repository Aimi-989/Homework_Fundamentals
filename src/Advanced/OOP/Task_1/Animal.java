package Advanced.OOP.Task_1;

public class Animal{
    public static void main(String[] args) {

        Dog tom = new Dog("Tom", "boy", "corgi", 4, 5);
        String tomName = tom.getName();
        int tomAge = tom.getAge();
        double tomWeight = tom.getWeight();

        System.out.println(tomName);
        System.out.println(tomAge);
        System.out.println(tomWeight);


    }
}

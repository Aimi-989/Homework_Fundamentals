package opp.Task_1_2;

public class Program {
    public static void main(String[] args) {

        Person human = new Person();
        Person human2 = new Person("Artur");

        System.out.println(human.name);
        System.out.println(human.age);

        System.out.println(human2.name);
        System.out.println(human2.age);

    }
}

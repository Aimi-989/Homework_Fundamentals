package Advanced.OOP.Task_1;

public class Dog {

    private String name;
    private String gender;
    private String race;
    private int age;
    private double weight;

    public Dog(){

    }

    public Dog(String name, String gender, String race, int age, double weight){
        this.name = name;
        this.gender = gender;
        this.race = race;
        this.age = age;
        this.weight = weight;
    }

    public Dog(String gender, String race){
        this.gender = gender;
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
            return;
        }
        System.out.println("Error");
    }
}

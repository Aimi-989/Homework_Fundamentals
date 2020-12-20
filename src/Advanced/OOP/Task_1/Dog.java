package Advanced.OOP.Task_1;

public class Dog {

    private String name;
    private String gender;
    private String race;
    private int age;
    private double weight;

    public Dog(String name, String gender, String race, int age, int weight){
        this.name = name;
        this.gender = gender;
        this.race = race;
        this.age = age;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
    public String getRace(){
        return race;
    }

    public void setRace(String race){
        this.race = race;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }else {
            System.out.println("Error");
        }
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        if(weight > 0) {
            this.weight = weight;
        }else {
            System.out.println("Error");
        }
    }

}

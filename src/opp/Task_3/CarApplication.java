package opp.Task_3;

public class CarApplication {
    public static void main(String[] args) {
        Car audi = new Car();

        audi.setModel("A8");
        audi.setColor("red");
        audi.setProductionYear(2018);
        audi.setUsed(true);
        audi.setDrive(78000);

        System.out.println(audi.getModel());
        System.out.println(audi.getColor());
        System.out.println(audi.getProductionYear());
        System.out.println(audi.isUsed());
        System.out.println(audi.getDrive());


    }
}

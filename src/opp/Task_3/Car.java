package opp.Task_3;

public class Car {
    private String model;
    private int productionYear;
    private String color;
    private boolean used = false;
    private int mileage;

    public void setModel(String audi) {
        model = "A8";
    }

    public void setColor(String audi) {
        color = "red";
    }

    public void setProductionYear(int audi) {
        productionYear = 2018;
    }

    public boolean setUsed(boolean audi) {
        used = true;
        return false;
    }

    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

    public int getProductionYear(){
        return productionYear;
    }
    public boolean isUsed(){
        return used;
    }

    public void setMileage(int audi){
        mileage = 78000;
    }

    public int getMileage(){
        return mileage;
    }
}

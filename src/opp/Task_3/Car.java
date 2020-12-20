package opp.Task_3;

public class Car {
    private String model;
    private int productionYear;
    private String color;
    private boolean used = false;
    private int mileage;

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public boolean setUsed(boolean Used) {
        //if(mileage > 0)
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

    public void setMileage(int mileage){
        this.mileage = mileage;
        //mileage = 78000;
        //if(mileage > 0){
            //setUsed(used);
        //}
    }

    public int getMileage(){
        return mileage;
    }
}

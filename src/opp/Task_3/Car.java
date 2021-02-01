package opp.Task_3;

public class Car {
    private String model;
    private int productionYear;
    private String color;
    private boolean used = false;
    private int drive;

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setUsed(boolean Used) {
        this.used = true;
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

    public void setDrive(int drive){
        if(drive > 0) {
            this.drive = drive;
            return;
        }
    }

    public int getDrive(){
        return drive;
    }
}

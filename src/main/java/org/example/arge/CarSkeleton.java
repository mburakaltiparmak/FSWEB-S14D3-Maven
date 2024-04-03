package org.example.arge;
public class CarSkeleton {
private String name;
private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public CarSkeleton(){

    }
    public void startEngine(){
        System.out.println("Engine has been started");
    }
    protected void runEngine(){
        System.out.println("Engine is running");
    }
    public void drive(){
        runEngine();
    }
}

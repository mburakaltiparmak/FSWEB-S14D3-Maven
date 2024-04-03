package org.example.company;
public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine(){
        return "Holden's engine is starting" + getClass().getSimpleName();
    }
    @Override
    public String accelerate()
    {
        return "Holden is accelerating" + getClass().getSimpleName();
    }
    @Override
    public String brake(){

        return "Holden is braking" + getClass().getSimpleName();
    }
}

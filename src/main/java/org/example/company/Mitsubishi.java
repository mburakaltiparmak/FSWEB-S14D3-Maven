package org.example.company;
public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine(){
        return "Mitsubishi's engine is starting" + getClass().getSimpleName();
    }
    @Override
    public String accelerate()
    {
        return "Mitsubishi is accelerating" + getClass().getSimpleName();
    }
    @Override
    public String brake(){

        return "Mitsubishi is braking" + getClass().getSimpleName();
    }
}

package org.example.company;
public class Ford extends Car {


    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine(){
        return "Ford's engine is starting" + getClass().getSimpleName();
    }
    @Override
    public String accelerate()
    {
        return "Ford is accelerating" + getClass().getSimpleName();
    }
    @Override
    public String brake(){

        return "Ford is braking" + getClass().getSimpleName();
    }
}

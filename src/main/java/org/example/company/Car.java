package org.example.company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Objects;

import static java.rmi.server.LogStream.log;

public class Car {
    private static final Log log = LogFactory.getLog(Car.class);
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }
    private void printSimpleName() {
        System.out.println("Car Brand: " + getClass().getSimpleName());
    }
    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public String startEngine(){
        printSimpleName();
        return "the car's engine is starting";
    }
    public String accelerate()
    {
        printSimpleName();
        return "the car is accelerating";
    }
    public String brake(){
    printSimpleName();
       return "the car is braking";
    }

    @Override
    public String toString() {
        return "Car{" +
                "cylinders=" + cylinders +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cylinders, name);
    }
}

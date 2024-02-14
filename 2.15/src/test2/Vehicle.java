package test2;

public abstract class Vehicle {
    String brand;
    String colour;
    int speed;
    int wheels;

    public Vehicle() {
    }

    public Vehicle(String brand, String colour, int speed, int wheels) {
        this.brand = brand;
        this.colour = colour;
        this.speed = speed;
        this.wheels = wheels;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void start(String colour,String brand){
        System.out.println(getColour()+"  " + getBrand() + "  is started");
    }

    public void accelerate(String colour,String brand,int speed){
        System.out.println(getColour()+"  "+ getBrand() +"  is accelerating at speed"+getSpeed()+"\t"+"km/h");
    }

    public void brake(String colour,String brand){
        System.out.println(getColour()+"  " + getBrand() +"  is braking");
    }









}

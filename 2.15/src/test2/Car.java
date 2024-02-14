package test2;

public class Car extends Vehicle {
    private int loader;

    @Override
    public void start(String colour, String brand) {
        super.start(colour, brand);
    }

    @Override
    public void accelerate(String colour, String brand, int speed) {
        super.accelerate(colour, brand, speed);
    }

    @Override
    public void brake(String colour, String brand) {
        super.brake(colour, brand);
    }

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }
}

package car;

public class Car {

    // Here these private variables cannot be used outside class
    private String colour;
    private int wheels;
    private int doors;
    private String model;

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWheels() {
        return this.wheels;
    }

    public int getDoors() {
        return this.doors;
    }

    public String getColour() {
        return this.colour;
    }

    public String getModel() {
        return this.model;
    }
}

package car;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car();

        bmw.setColour("Black");
        bmw.setDoors(4);
        bmw.setModel("Latest");
        bmw.setWheels(4);

        System.out.println(bmw.getWheels() + " " + bmw.getDoors() + " " + bmw.getModel() + " " + bmw.getColour());
    }
}
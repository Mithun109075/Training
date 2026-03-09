package Assignment2;
interface Vehicle {
    void start();   // interface method
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting");
    }
}

public class InterfaceVehicle {
    public static void main(String[] args) {
        Car c = new Car();   // object creation
        c.start();           // method call
    }
}

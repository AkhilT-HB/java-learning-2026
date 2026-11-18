package oops;

public class Abstraction {

    public static void main(String[] args) {
        Vehicle vehicle = new Car();

        vehicle.start();
        vehicle.stop();
    }
}

abstract class Vehicle {

    abstract void start();

    void stop(){
        System.out.println("Vehicle stopped");
    }

    void running(){
        System.out.println("Vehicle is running");
    }

}

class Car extends Vehicle{

    @Override
    void start() {
        System.out.println("Car started");
    }

    void stop(){
        System.out.println("Car stopped");
    }
}
public abstract class Vehicle {
    public abstract void startEngine();

    public static void main(String[] args) {
        Vehicle car = new Car();
        car.startEngine();

        Vehicle bike = new Bike();
        bike.startEngine();
    }
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }
}

class Bike extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Bike engine started.");
    }
}
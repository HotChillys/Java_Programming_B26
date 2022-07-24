package day56_polymorphism.car;

public class Car {  }

class BMW extends Car{ }

class Tesla extends Car{ }

class Toyota extends Car{ }

class Ford extends Car{ }

class LanRover extends Car{ }

class Dealership {

    public static void lease(Car car){
        System.out.println("Leasing a car " + car.getClass().getName());
    }

    //Tesla object or the Toyota object are able to have a reference of the Car which means this method is flexible to be used with any subclass of the Car
    public static Car getCar(int option) {
        if (option == 1) {
            return new Tesla();
        } else if (option == 2) {
            return new Toyota();
        }
        return new Car();
    }
}

class Runner{
    public static void main(String[] args) {

        Car car = new Car();
        Dealership.lease(car);

        Tesla tesla = new Tesla();
        Dealership.lease(tesla);

        Dealership.lease(new LanRover());
        Dealership.lease(new Toyota());
    }
}

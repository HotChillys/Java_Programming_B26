package day53_abstraction.cars;

import day53_abstraction.cars.ElectricCar;

public class Tesla extends ElectricCar {

    @Override
    public void start() {
        System.out.println("card in teh car");
        System.out.println("press button");
    }

    @Override
    public void charge() {

        System.out.println("charging tesla");
    }


}

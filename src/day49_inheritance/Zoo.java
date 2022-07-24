package day49_inheritance;

public class Zoo {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.species = "Generic Animal";
        animal.numberOfLeg = 0;
        animal.walk();

        Dog dog = new Dog();
        dog.species = "K9";
        dog.numberOfLeg = 4;

        Lion lion = new Lion();
        // Q: how many instance variable does the lion object have access to? A: 3

        //Q: how many instance methods does the lion object have access to? A: 2

        lion.roar();
        lion.species = "cat";
        lion.walk();





    }
}

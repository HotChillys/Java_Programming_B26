package day49_inheritance;

public class Person {
    /*
    person is the super class
    name, age, hobby
    talk() method

    student class is the sub class of Person
    FunLevel
    study() method


     */

    String name;
    int age;
    String hobby;

    public void talk(){
        System.out.println(name + " is talking");
    }

}

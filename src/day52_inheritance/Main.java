package day52_inheritance;

public class Main {
    public static void main(String[] args) {

        new Parent().walk();
        new Child().walk();
    }

}

class Parent {

    public final void walk(){
        System.out.println("You are walking");
    }

}

class Child extends Parent{

//    @Override
//    public final void walk(){
//    }
    // we can't override final method

}
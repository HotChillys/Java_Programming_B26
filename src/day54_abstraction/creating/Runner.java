package day54_abstraction.creating;

import day52_inheritance.hiding.B;

public class Runner {
    public static void main(String[] args) {

        //Create obj = new Create();    // we can't make object of interfaces.

        Book obj = new Book(); // Book is a normal ( non-abstract ) class
        obj.read();
        obj.write();









    }
}

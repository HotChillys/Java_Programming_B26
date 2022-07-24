package day52_inheritance.hiding;

public class CallMethod {
    public static void main(String[] args) {

        A obj = new A();
        obj.instanceMethodA();
        A.staticMethod(); // it calls the closest one to the class

        B obj2 = new B();
        obj2.instanceMethodA();
        B.staticMethod();


    }
}

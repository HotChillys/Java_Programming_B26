package day36_methods;

public class OverloadAndReturn {
    public static void method() {
        System.out.println("default empty method");
    }


    //public static int method() // this is not valid, changing the return type doesn't overload

    public static int method(int a ) {
        return 0;
    }
}

package day34_methods;

public class VoidVSReturn {
    public static void main(String[] args) {
        sayHello();
        //String msg = sayHello();   // this doesn't work because the method is void

        sayBye(); // it won't print like void method, we have to print it with "SOUT" because return has value
        System.out.println(sayBye());
        String msg = sayBye();    // we can assign return type
        System.out.println(msg);
    }
    public static void sayHello() {
        System.out.println("Hello");
    }

    public static String sayBye() {
        return "Bye";
    }
}

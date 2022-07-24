package Foo_IQ;

public class SwapNumberWithoutThirdVar {
    /*
    Swap two variable' values without using a third variable
     */
    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);


    }


}

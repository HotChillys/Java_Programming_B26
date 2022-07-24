package day63_functional_interface;

public class UsingDynamicInterface {
    public static void main(String[] args) {

        DynamicInterface<String> printEachChar = (str) -> {

            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));
            }

        };


        printEachChar.test("hello world");

        System.out.println();

        DynamicInterface<Integer> printNumber5Times = n -> {
            System.out.println(n);
            System.out.println(n);
            System.out.println(n);
            System.out.println(n);
            System.out.println(n);
        };

        printNumber5Times.test(5);

    }
}

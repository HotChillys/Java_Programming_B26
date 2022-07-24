package Foo_IQ;

public class DivideWithoutOperator {
    /*
        Write a method that can divide two numbers without using division operator
     */

    public static void main(String[] args) {


        int a = 4;
        int b = 20;

        System.out.println(withoutOperator(a, b));

    }

    public static int withoutOperator(int a, int b) {
        //a-b logic

        int result = 0;

        if (a > b) {

            int temp = a;

            for (int i = 0; i < a; i+=b) {
                if (temp > b) {
                    temp = a - b;
                    result++;
                }
            }
        }

        if (a < b) {

            int temp = b;

            for (int i = 0; i < b; i+=a) {
                if (temp > a) {
                    temp = b - a;
                    result++;
                }
            }

        }


        return result;
    }
}

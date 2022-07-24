package day28_array;

public class Number100 {
    public static void main(String[] args) {

        int [] number = new int[100];
        number [3] = 5;
        number [47] = 309;
        number [99] = 9;

        System.out.println(number[3]);
        System.out.println(number[47]);
        System.out.println(number[99]);
        System.out.println(number[23]);

        for (int each : number) {
            System.out.print(each);
        }










    }
}

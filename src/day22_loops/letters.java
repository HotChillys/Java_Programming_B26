package day22_loops;

public class letters {
    public static void main(String[] args) {

        /*
        write a program that will print all the alphabet letters in lowercase from
        'a' to 'z'
         */

        char a = 'a';

        while (a <= 'z') {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        /*
        write a program that will print all the alphabet letters in uppercase from
        'A' to 'Z'
         */
        char b = 'A';
        while (b <= 'Z') {
            System.out.print(b + " ");
            b++;
        }
        System.out.println();
        /*
        write a program that will print all the alphabet letters backwards in
        lowercase from 'z' to 'a'
         */
        char c = 'z';
        while (c >= 'a') {
            System.out.print(c + " ");
            --c;
        }
        System.out.println();

        /*
        write a program that will print all the alphabet letters backwards in
        uppercase from 'Z' to 'A'
         */
        char d = 'Z';
        while (d >= 'A') {
            System.out.print(d + " ");
            --d;
        }
        System.out.println();










    }
}

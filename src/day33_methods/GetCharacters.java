package day33_methods;

public class GetCharacters {
    /*
    make a method that prints all the letters from A - Z
    make a method that prints all the letters from a - z
    make a method that prints all the letters from Z - A
    make a method that prints all the letters from z - a
    make a method that prints all the numbers from 0 - 9
     */
    public static void AtoZ() {
        char n = 'A';
        while (n <= 'Z') {
            System.out.print(n + " ");
            n++;
        }
        System.out.println();
    }

    public static void aToz() {
        char n = 'a';
        while ( n <= 'z') {
            System.out.print(n + " ");
            n++;
        }
        System.out.println();
    }

    public static void ZtoA() {
        char n = 'Z';
        while (n >= 'A') {
            System.out.print(n + " ");
            n--;
        }
        System.out.println();
    }

    public static void zToa() {
        char n = 'z';
        while (n >= 'a') {
            System.out.print(n + " ");
            n--;
        }
        System.out.println();
    }

    public static void print0To9() {
        for (char i = '1'; i <= '9'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AtoZ();
        aToz();
        ZtoA();
        zToa();
        print0To9();
    }
}

package day63_functional_interface;

public class CallPredicateMethods {
    public static void main(String[] args) {

        System.out.println(UsePredicate.isPalindrome.test("racecar"));

        System.out.println(UsePredicate.isPalindrome.test("abc"));

        System.out.println(UsePredicate.isPrime.test(10));
        System.out.println(UsePredicate.isPrime.test(5));

    }
}

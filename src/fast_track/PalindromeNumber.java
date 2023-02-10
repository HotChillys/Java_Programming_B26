package fast_track;

public class PalindromeNumber {
    public static void main(String[] args) {

        int n = 12321;
        int orig = n;
        int reverse = 0;

        while(n > 0) {
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n /= 10;

        }
        System.out.println(orig + " is " + (reverse == orig ? "Palindrome" : "Not Palindrome"));
    }
}

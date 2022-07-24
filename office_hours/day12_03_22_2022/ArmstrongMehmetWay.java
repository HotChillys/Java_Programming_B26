package day12_03_22_2022;

public class ArmstrongMehmetWay {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            isArmstrong(i);
        }

    }

    public static void isArmstrong(int number) {
        int lastDigit = 0;
        int totalDigits = 0;
        int originalNumber = number;

        while (number > 0) {
            lastDigit = number % 10; // to find last digit
            number /= 10; // number = number / 10;
            totalDigits += lastDigit * lastDigit * lastDigit;
        }

        if (totalDigits == originalNumber) {
            System.out.println(originalNumber);
        }

    }
}

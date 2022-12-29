package java_codes_100;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        // Fahrenheit to celsius ((a-32)*5)/9 or (a-32)*0.5556
        // Celsius to Fahrenheit (a*(9/5))+32 or (a*1.8)+32
        System.out.println(fahrenheitToCelsius());
        System.out.println(celsiusToFahrenheit());


    }

    public static float fahrenheitToCelsius() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        float f = input.nextFloat();
        float t = ((f-32)*5)/9;
        return t;
    }

    public static float celsiusToFahrenheit() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius");
        float c = input.nextFloat();
        float f = (float) ((c*1.8)+32);
        return f;
    }
}

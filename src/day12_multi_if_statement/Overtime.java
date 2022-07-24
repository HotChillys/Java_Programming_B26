package day12_multi_if_statement;

import java.util.Scanner;

public class Overtime {
    public static void main(String[] args) {

        /*
        create a double variable for your hourly rate
        create a double variable for the number of hours worked
        calculate your net pay, with consideration of overtime pay
        if you worked more than 40 hours you get overtime pay for the hours
        past 40. Overtime pay is 1.5 the normal rate
        (if you worked 43 hours, you will get 40 hours normal pay
        and 3 hours overtime pay)
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your hourly rate: ");
        double rate = input.nextDouble();

        System.out.println("Enter the regular hours you worked this week: ");
        double regularHour = input.nextDouble();

        System.out.println("Enter the overtime you worked this week: ");
        double overtimeHour = input.nextDouble();

        double totalHourWorked = regularHour + overtimeHour;
        System.out.println("Enter total hours you worked this week is " + totalHourWorked);

        double totalPay = (regularHour * rate) + ((totalHourWorked - regularHour) * rate * 1.5);

        if ( regularHour < 40) {
            System.out.println("Your total pay is " +(rate * regularHour));}
        else {
            System.out.println("Your total pay is $" +totalPay);}













    }
}

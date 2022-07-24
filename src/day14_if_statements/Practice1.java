package day14_if_statements;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        /*
        declare and assign an age variable
        use these ranges to determine which age group you belong to
        if the given age value is less than 0 or more than 120:
        print: Invalid age
        otherwise uses these to determine the age group
        Baby (2 years and below)
        Toddler (3 - 5)
        Kid (6 - 9
        Pre-Teen (10 - 12)
        Teenager (13 - 17)
        Young Adult (18 - 20)
        Adult (21 - 35)
        Middle-Aged Adult (36 - 55)
        Senior Citizen (55+)
         */

        Scanner input = new Scanner(System.in);

        int age = 65;
        String message;

        if (age < 0 || age > 120 ) {
            message = "Invalid age";
        } else {
            if (age <= 2) {
                message = "Baby";
            } else if (age >=3 && age <= 5) {
                message = "Toddler";
            } else if (age >=6 && age <= 9) {
                message = "Kid";
            } else if (age >= 10 && age <= 12) {
                message = "Pre-Teen";
            } else if (age >= 13 && age <= 17) {
                message = "Teenager";
            } else if (age >= 18 && age <= 20) {
                message = "Young Adult";
            } else if (age >=21 && age <=35) {
                message = "Adult";
            } else if (age >= 36 && age <= 55) {
                message = "Middle-Aged Adult";
            } else {
                message = "Senior Citizen";
            }
        }
        System.out.println(message);









    }
}

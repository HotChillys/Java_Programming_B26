package day05_variables;

public class EmployeeInfo {

    public static void main(String[] args) {

        /* Task

    create a class EmployeeInfo
    create a main method
    declare and assign these variables:
        first name, last name, gender, age, company name, are the fulltime, job title, salary, number of pto, are they married, suite(char - A, B, C, D)

    Print all the variables*/

        String firstName = "Tyler";
        String lastName = "Potter";
        String gender = "male";
        byte age = 26;
        String companyName = "Fedex";
        String status = "full time";
        String jobTitle = "driver";
        int salary = 27;
        int sickDays = 30;
        String marriedStatus = "single";
        char suite = 'A';

        System.out.println(firstName+" "+lastName +","+age+" year old " +gender+" was hired as a "+status+" "+jobTitle+" for "+companyName+".");
        System.out.println("He is currently "+marriedStatus+" assigned to room "+suite+"." );
        System.out.println("His current salary is $"+salary+" per hour with "+sickDays+" days of paid leave.");


    }
}

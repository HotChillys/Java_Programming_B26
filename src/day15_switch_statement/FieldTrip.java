package day15_switch_statement;

import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {

        /*
        Create a class called FieldTrip.
        Your school goes on a Field trip each year. The place you go will be based
        on your grade. Based on the grade level (1-6) figure out the details of
        your field trip. Print the information at the end.
        declare and assign the grade level variable
        only check for the data for valid grades which are only grades
        values from 1-6. Less than 1 and more than 6 is invalid,
        so print: "Grade must be between 1-6"
        Data based on grade:
        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith
        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee
        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson
        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes
        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela
        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Which grade are you in?");
        int grade = input.nextInt();

        int  numGroup = 3;
        String location, message  = "", teacherInCharge = "";

        if (grade < 1 || grade > 6) {
            message = "Grade must be between 1-6";
        } else {
            if (grade == 1){
                location = "Apple Orchard";
                numGroup = 3;
                teacherInCharge = "Ms. Smith";
                message = "Grade " +grade+ "\nLocation is " +location+ "\nnumber of groups are " +numGroup+ "\nTeacher in charge is " +teacherInCharge;
            } if (grade ==2) {
                location = "Zoo";
                numGroup = 7;
                teacherInCharge = "Mr.Lee";
                message = "Grade " +grade+ "\nLocation is " +location+ "\nnumber of groups are " +numGroup+ "\nTeacher in charge is " +teacherInCharge;
            } if (grade == 3) {
                location = "Aquarium";
                numGroup = 5;
                teacherInCharge = "Ms. Wilson";
                message = "Grade " +grade+ "\nLocation is " +location+ "\nnumber of groups are " +numGroup+ "\nTeacher in charge is " +teacherInCharge;
            } if (grade == 4) {
                location = "Movie Theater";
                numGroup = 2;
                teacherInCharge = "Ms. Reyes";
                message = "Grade " +grade+ "\nLocation is " +location+ "\nnumber of groups are " +numGroup+ "\nTeacher in charge is " +teacherInCharge;
            }if (grade == 5) {
                location = "Museum";
                numGroup = 5;
                teacherInCharge = "Ms. Lela";
                message = "Grade " +grade+ "\nLocation is " +location+ "\nnumber of groups are " +numGroup+ "\nTeacher in charge is " +teacherInCharge;
            } if (grade == 6) {
                location = "Six Flag";
                numGroup = 8;
                teacherInCharge = "Mr. Watts";
                message = "Grade " +grade+ "\nLocation is " +location+ "\nnumber of groups are " +numGroup+ "\nTeacher in charge is " +teacherInCharge;
            }
        }

        System.out.println(message);




    }
}

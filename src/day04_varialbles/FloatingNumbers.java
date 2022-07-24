package day04_varialbles;

public class FloatingNumbers {
    public static void main(String[] args) {

        //in java you can't store fractions 3/4

        double price = 3.99;

        float average = 0.14F;
/*Task:

    class name: School

declare and assign these variables
    number of students in grade 1
    number of students in grade 2
    number of students in grade 3
    number of students in grade 4
    number of students in grade 5

    total number of students in your school

    number of days in a year (have some half day = ~ 100.5)
    number of snow days in a year (double)
    average gpa in school

    print all the variables with unique messages  */

        int student = 20;
        System.out.println("The number of student in grade 1 is "+student);

        student = 19;
        System.out.println("The number of student in grade 2 is "+student);

        student = 20;
        System.out.println("The number of student in grade 3 is "+student);

        student = 22;
        System.out.println("The number of student in grade 4 is "+student);

        student = 21;
        System.out.println("The number of student in grade 5 is "+student);

        student = 429;
        System.out.println("Total number of students in school is "+student);

        double day = 235.5;
        System.out.println("The number of school days in a year is "+day);

        day = 5.3;
        System.out.println("The number of snow days this year is "+day);

        day = 3.2;
        System.out.println("The average GPA in school is "+day);

        System.out.println("____________________________________________");

        int numberofstudentingrade1 = 32;
        int numberofstudentingrade2 = 25;
        int numberofstudentingrade3 = 34;
        int numberofstudentingrade4 = 19;
        int numberofstudentingrade5 = 28;

        int totalnumberofstudent = numberofstudentingrade1 + numberofstudentingrade2 + numberofstudentingrade3 + numberofstudentingrade4 + numberofstudentingrade5;

        System.out.println("number of student in grade1 = " + numberofstudentingrade1);
        System.out.println("number of student in grade2 = " + numberofstudentingrade2);
        System.out.println("number of student in grade3 = " + numberofstudentingrade3);
        System.out.println("number of student in grade4 = " + numberofstudentingrade4);
        System.out.println("number of student in grade5 = " + numberofstudentingrade5);

        System.out.println("The total number of students in school is "+totalnumberofstudent);

        








    }
}

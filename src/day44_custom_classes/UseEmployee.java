package day44_custom_classes;

import day44_custom_classes.Employee;

public class UseEmployee {
    public static void main(String[] args) {

        Employee number1 = new Employee("Megan", "PO4");
        System.out.println(number1);
        System.out.println();

        number1.goToMeeting();
        System.out.println();

       Employee number2 = new Employee("Megan", 7106432, "PO4", 20_000 );

        System.out.println(number2);
        number2.goToMeeting();

    }
}

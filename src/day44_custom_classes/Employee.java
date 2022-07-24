package day44_custom_classes;

public class Employee {
    /*
    create a class called Employee

        - data:

            name, id, job title, salary

        - constructor

            - create a constructor that creates an Employee object with the name and job title

            - create a constructor that creates an Employee object with the name, id, job title, and salary

        - method:

            goToMeeting()
                when this method is called print:
                    $name is going to a meeting

            toString()
                print all the employees information

    Create a separate class to create and test the Employee objects
     */

    String name;
    int id;
    String jobTitle;
    double salary;

    public Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public Employee(String name, int id, String jobTitle, int salary) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void goToMeeting() {
        System.out.println(this.name + " is going to meeting");
    }

    @Override
    public String toString() {
        return "Employee Info " +
                "\nname: " + name +
                ", \nID: " + id +
                ", \nJob Title: " + jobTitle +
                ", \nSalary: $" + salary;
    }


}

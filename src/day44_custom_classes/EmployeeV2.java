package day44_custom_classes;

public class EmployeeV2 {

    String name;
    int id;
    String jobTitle;
    double salary;

    public EmployeeV2(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public EmployeeV2(String name, int id, String jobTitle, int salary) {
        this(name, jobTitle);
        this.id = id;
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

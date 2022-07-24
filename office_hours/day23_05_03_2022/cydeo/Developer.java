package day23_05_03_2022.cydeo;

public final class  Developer extends Employee{

    public Developer(String name, char gender, int age, String jobTitle, int employeeID, double salary) {
        super(name, gender, age, jobTitle, employeeID, salary);
    }

    @Override
    public void work() {
        super.work();
    }

    @Override
    public void attendMeeting() {
        super.attendMeeting();
    }
}

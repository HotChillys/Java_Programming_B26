package day23_05_03_2022.cydeo;

public final class Tester extends Employee{
    public Tester(String name, char gender, int age, String jobTitle, int employeeID, double salary) {
        super(name, gender, age, jobTitle, employeeID, salary);
    }
    /*
                	 1. Tester
                	variables: name, gender, age, jobTitle, employeeID, salary
                    methods: work(), attendMeeting()
     */

    @Override
    public void work() {
        System.out.println(getName() + " is working today");
    }

    @Override
    public void attendMeeting() {
        System.out.println(getJobTitle() + getName() + " attended meeting today");
    }

    @Override
    public void drink(String beverage) {
        System.out.println(getJobTitle() + " " + getName() + " is drinking");
    }


}

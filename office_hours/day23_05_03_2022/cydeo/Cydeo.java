package day23_05_03_2022.cydeo;

public class Cydeo {
    public static void main(String[] args) {

        Student student = new Student("Mike", 'M', 25, "Cydeo", 123456);
        System.out.println(student);

        Employee employee = new Employee("Alice", 'F', 34, "tester", 654251, 150_000);
        System.out.println(employee);

        Tester tester = new Tester("Amy", 'F', 23, "Tester", 52412, 120_000);
        System.out.println(tester);
        //OVERRIDDEN METHODS
        tester.attendMeeting();
        tester.work();
        tester.drink("poison");
        // COMES FROM PARENTS
        tester.eat("pizza");
        tester.sleep();


        Developer developer = new Developer("Kyle", 'M', 56, "developer", 52114, 200_000);
        System.out.println(developer);


    }



}

package day45_custom_classes;

public class Offer {
    /*

    create a class called Offer

        - data:

            location, company, salary, is full time, number of PTO

        - constructor

            - create a constructor that creates an Offer object with the company and location

            - create a constructor that creates an Offer object with the company, location, and salary

            - create a constructor that creates an Offer object with the company, location, salary, is full time, and number of PTO


        - method:

            toString()
                print all the employees information

    Create a separate class to create and test the Offer objects
     */

    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numberOfPTO;

    public Offer(String company, String location) {
        this.location = location;
        this.company = company;
    }

    public Offer(String company,String location,  double salary) {
        this.location = location;
        this.company = company;
        this.salary = salary;
    }

    public Offer( String company,String location, double salary, boolean isFullTime, int numberOfPTO) {
        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }

//    @Override
//    public String toString() {
//        return "Company name: " + company +
//                "\nCompany location: " + location +
//                "\nIs it full time: " + (isFullTime ? "yes" : "no") +
//                "\nSalary: " + salary +
//                "\nNumber of PTO: " + numberOfPTO;

    public String toString() {
        String info = company + " located in " + location;
        info += " - " + (salary > 0 ? salary : "");
        info += " - " + (isFullTime ? "Full Time" : "Contract");
        info += " - " + (numberOfPTO > 0 ? numberOfPTO : "");
        return "\n"  + info ;

    }
}

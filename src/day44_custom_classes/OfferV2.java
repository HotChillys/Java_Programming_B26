package day44_custom_classes;

public class OfferV2 {

    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numberOfPTO;

    public OfferV2(String location, String company) {
        this.location = location;
        this.company = company;
    }

    public OfferV2(String location, String company, double salary) {
       this(location, company);
        this.salary = salary;
    }

    public OfferV2(String location, String company, double salary, boolean isFullTime, int numberOfPTO) {
       this(location, company, salary);
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }

    public String toString() {
        String info = company + " located in " + location;
        info += "\n" + (salary > 0 ? salary : "");
        info += "\n" + (isFullTime ? "Full Time" : "Contract");
        info += "\n" + (numberOfPTO > 0 ? numberOfPTO : "");
        return  info;

    }
}

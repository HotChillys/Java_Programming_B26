package day48_encapsulation;

public class FlightTicket {

   private String type;
   private String departure;
   private String arrival;


    public FlightTicket(String type, String departure, String arrival) {
        setType(type);
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type.equalsIgnoreCase("first") || type.equalsIgnoreCase("business") || type.equalsIgnoreCase("economy")){
            this.type = type;
        }
    }


}

package day14_if_statements;

public class Practice3 {
    public static void main(String[] args) {

        /*
        The length of the movie will determine how much it costs.
        declare and assign a variable for the duration of the movie
        The length will be given as a decimal as hours.minutes
        duration of less than or equal to 0:
        Movies cannot be less than 0 minutes

        duration of more than 4:
        Movies cannot be more than 4 hours

        for all other duration uses the following values to display the
        price of the ticket
        duration --> price
        1.0 --> 8.99
        1.5 --> 10.50
        2.0 --> 12.99
        2.5 --> 14.50
        3, 3.5 or 4 --> 15.99
            */

        double duration = 3.5;
        String message = "";

        if (duration < 0) {
            message = "Movies cannot be less than 0 minutes";
            if (duration > 4) {
                message = "Movies cannot be more than 4 hours";
            }
        } else {
            if (duration == 1.0) {
                message = "$8.99";
            } if (duration == 1.5) {
                message = "$10.50";
            }  if (duration == 2.0) {
                message = "$12.99";
            }if (duration == 2.5) {
                message = "$14.50";
            } if (duration == 3.0 || duration == 3.5 || duration == 4.0) {
                message = "$15.99";
            }
        }

        System.out.println(message);







    }
}

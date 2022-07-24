package day30_array;

public class UrlParts {
    public static void main(String[] args) {
        /*
        Given a url as follows, print each section of the url separated by the forward slash /

	Example:
		url = https://learn.cydeo.com/courses/130

	output:
		https:

		learn.cydeo.com
		courses
		130
         */
        String url = "https://learn.cydeo.com/courses/130";

        String [] each = url.split("/");

        for(String slash : each) {
            System.out.println(slash);
        }





    }
}

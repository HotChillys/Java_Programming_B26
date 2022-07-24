package day31_array;

public class AWS_Zones {
    public static void main(String[] args) {
        /*
        Given an app name and a String of zones in the following format

	us-east-1,us-west-1,us-west-2,us-west-3

	print the app deploying to each zone

Ex:
	app = etsy
    zones = us-east-1,us-west-2,us-west-1

    output:
		Deploying etsy to us-east-1...
		Deployment completed for us-east-1

		Deploying etsy to us-west-1...
		Deployment completed for us-west-1

		Deploying etsy to us-west-2...
		Deployment completed for us-west-2
         */
        String app = "Etsy";
        String zones = "us-east-1,us-west-1,us-west-2,us-west-3";
        String [] split = zones.split(",");

        for (String a : split) {
            System.out.println("Deploying " + app + " to " + a);
            System.out.println("Deployment completed for " + a);
            System.out.println();
        }





    }
}

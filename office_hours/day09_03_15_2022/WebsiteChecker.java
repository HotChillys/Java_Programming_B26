package day09_03_15_2022;

public class WebsiteChecker {
    public static void main(String[] args) {
        /*
        Given some urls determine how many .com, .org, and .edu websites
        there are. Also keep track of an ‘other’ category for websites that have
        a different domain
        Sample websites for an array:
        bing.com, wikimedia.org, twitter.com, amazonaws.com, japanpost.jp, mysql.com,
        nasa.gov, linkedin.com, ucla.edu, github.io, spotify.com, mozilla.org, nba.com,
        comcast.net, tamu.edu, utexas.edu,
         */
        String [] website = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com",
                "nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com",
                "comcast.net", "tamu.edu", "utexas.edu"};

        int indexOfCom = 0;
        int indexOfOrg = 0;
        int indexOfEdu = 0;
        int indexOfOther = 0;

        for (int i = 0; i < website.length; i++) {

            if (website[i].contains("com")) {
                indexOfCom++;
            } else if (website[i].contains("org")) {
                indexOfOrg++;
            } else if (website[i].contains("edu")) {
                indexOfEdu++;
            } else {
                indexOfOther++;
            }

        }
        System.out.println("There are " +indexOfCom + " .com ");
        System.out.println("There are " + indexOfOrg + " .org ");
        System.out.println("There are " + indexOfEdu + " .edu ");
        System.out.println("There are " + indexOfOther + " other domain");








    }
}

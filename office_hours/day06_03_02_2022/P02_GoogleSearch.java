package day06_03_02_2022;

public class P02_GoogleSearch {
    public static void main(String[] args) {

/*
Assume that you searched a word in Google  Search Engine.After that you took a result message like this


	   "About 3,640,000,000 results (0.78 seconds)"

		According to this result print out search Time and number of Result

		Input :  "About 640,000,000 results (0.78 seconds)"

		Output:
					Result number is 640,000,000
					Response time is 0.78 seconds
 */

        String searchResult = "About 640,000,000 results (0.78 seconds)";

        String result1 = searchResult.substring(searchResult.indexOf(' ') + 1, searchResult.indexOf(" r"));
        String result2 = searchResult.substring(searchResult.indexOf("(") + 1, searchResult.indexOf(")"));

        System.out.println("Result number is " + result1 + "\nRespond time is " + result2);








    }
}

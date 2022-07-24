package day06_03_02_2022;

import java.util.Scanner;

public class P01_Etsy {
    public static void main(String[] args) {

        /*
        Assume that you searched a baby toy in Etsy.When you open related category your url is :

		"https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049"
			    		       (main category)

		According to this result print out main category name

			Input :  https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049

			Output:
				Main Category name is  toys and games

			Input :  https://www.etsy.com/c/toys-and-entertainment?ref=catnav-11049
						 				     (main category)

			Output:
				Main Category name is  toys and entertainment
         */
        String url = "https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049";

      //  String url = "https://www.etsy.com/c/toys-and-entertainment?ref=catnav-11049";

        //second url
        int startIndex = url.indexOf("c/");
        int endIndex = url.indexOf("?");

        String categoryName = url.substring(startIndex + 2, endIndex);
        categoryName = categoryName.replace('-', ' ');


        // first url
        if (url.contains("/")) {
            categoryName = categoryName.substring(0,categoryName.indexOf("/"));
        }


        System.out.println(categoryName);






    }
}

package day22_loops;

import java.util.Scanner;

public class ColourPicker {
    public static void main(String[] args) {

        /*
        you are working on some art piece

        this program will help you pick some colours

        flow: ask for a colour
         get 2 unique colours by the end
         */
        Scanner input = new Scanner(System.in);

        int colourPicked = 0;
        String uniqueColours = "";

        while (colourPicked < 3) {
            System.out.println("Pick a colour");
            String colour = input.nextLine();

            if (uniqueColours.contains(colour)) {
                System.out.println("You already have that colour");
            } else {
                uniqueColours += colour + " ";
                colourPicked++;
            }

        }


        System.out.println(uniqueColours);





    }
}

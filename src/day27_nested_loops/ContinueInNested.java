package day27_nested_loops;

public class ContinueInNested {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            if (i == 1 || i == 2) {
                continue; // i and j won't run because continue skips the iteration

            }

            System.out.println("i " + i);

            for (int j = 0; j < 3; j++) {

//                if (j == 1) {
//                    continue; // continue here is skipping the iteration when j is 1, so it is not getting printed
//                }

                System.out.println("\tj " + j);

            }

        }








    }
}

package day23_loops;

public class ForLoopExample {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            System.out.print(i);
        }

    /*
    flow of for loop
    1) the loop executes the initialization part  and declare and assign a variable

        in our example: int i = 1;

        initialization part runs in the beginning

    2) boolean condition/termination condition

        -> if the boolean in true: the loop will execute the statement
        -> if the boolean is false: the loop stop

        in our example: i <= 10

    3) the statement in the code body are executed top to bottom

        in our example: System.out.println(i);

    4) update happens

        in our example: i++;

    5) goes back to step 2 and repeats


*/

        // if you did the same code as above with while loop:

        int z = 1;

        while(z <= 10){
            System.out.println(z);
            z++;
        }













    }
}

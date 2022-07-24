package day27_nested_loops;

public class BreakInNested {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            System.out.print(i);

            if (i == 3) {
                break;  // when this break statement runs, we stop the outer loop, which means both will no longer run. we get 3 full iteration of the outer loop, including the inner loop running starts to finish then when i is equal to 3, the outer loop will stop.
            }


            for (int j = 0; j < 2; j++) {

                System.out.print(j);
//                break;  // if the break is here, the outer loop will iterate fully, but the inner loop will execute the first iteration and then the break runs, which stops the inner                              loop. code resumes after the outer loop iteration finishes.
            }
            System.out.println();
//            break;   // if the break is here, first iteration of outer loop runs, then the outer loop stops

        }







    }
}

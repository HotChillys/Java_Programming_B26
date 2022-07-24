package day12_03_22_2022;

public class IQ_NumberOfSteps {

    /*
    We have a record of every time a change of directory is performed.The different change directory functions are as follow ;

    				 ../  Go back to parent folder of current folder
    				 ./   Remain in the same folder
    				 x/   Go to the child folder named x( or what ever the name of the folder is

    				 Write a method to Find the minimum steps required to go back to main directory from current folder.The sequence of operations performed after entering the main directory provided

    				 Input : {"x/", "y/", "../", "z/", "./"}

    				 Output : 2
     */
    public static void main(String[] args) {
        String[] input = {"x/", "y/", "../", "z/", "./"};
        minSteps(input);
    }

    public static void minSteps(String[] steps) {
        int count = 0;

        for (String eachStep : steps) {

            switch (eachStep) {

                case "./":
                    break;
                case "../":
                    count--;
                    break;
                default:
                    count++;
                    break;
            }

        }
        System.out.println(count);
    }
}

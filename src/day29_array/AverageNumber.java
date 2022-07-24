package day29_array;

public class AverageNumber {
    public static void main(String[] args) {
        /*
        Given an int array calculate the average number
        -> Make it flexible so it will work with any array size
        Examples:
        [1,2,3] -> average: 2
        [10, 15, 5, 6] -> average: 9
        [4, 5, 6, 7, 8, 10, 20, 30, 0] -> average: 10
         */
        int[] number = {10, 15, 5,6};
        int sum =0;

//        for (int i = 0; i < number.length; i++) {
//            sum += number[i];
//        }


        for (int each : number) {
            sum += each;
        }
        System.out.println("Average" + sum / number.length);







    }
}

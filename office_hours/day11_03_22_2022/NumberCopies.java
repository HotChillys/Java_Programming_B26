package day11_03_22_2022;

public class NumberCopies {
        /*
         Write a method that accepts a string and a non-negative number,
            	and prints a larger string that is number copies of the original String

                stringTimes("Hi", 2); = > HiHi
                stringTimes("Hi", 3); = > HiHiHi
                stringTimes("Hi", 1); = > Hi
         */
 public static void numbersOfCopies(String words, int num) {
     for (int i = 0; i < num; i++) {
         System.out.print(words);
     }
 }


    public static void main(String[] args) {
        String word = "Java";
        int num = 3;
        numbersOfCopies(word, num);
    }











}

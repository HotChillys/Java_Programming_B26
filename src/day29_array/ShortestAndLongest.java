package day29_array;

public class ShortestAndLongest {
    public static void main(String[] args) {
        /*
        • Write a program that can return the shortest string element from a String array
        • Write a program that can return the longest string element from a String array
         */

        String [] strs = {"apple", "java", "computer", "water"};
        String smallest = strs[0];
        String biggest = strs[0];

//        for (int i = 0; i < strs.length; i++) {
//
//            if (strs[i].length() > biggest.length()) {
//                biggest = strs[i];
//            }
//            if (strs.length < smallest.length()) {
//                smallest = strs[i];
//            }
//        }

        //with for each loop
        for (String word : strs) {
            if (word.length() > biggest.length()) {
                biggest = word;
            }
            if (word.length() < smallest.length()) {
                smallest = word;
            }
        }


        System.out.println("smallest String: " + smallest);
        System.out.println("biggest String: " +biggest);











    }
}

package day19_String;

public class IndexOfMethod3 {
    public static void main(String[] args) {

        String word = "definition";
        //             0123456789

        System.out.println("first i: " + word.indexOf('i')); // 3
        System.out.println("last i: " + word.lastIndexOf('i')); // 7

        System.out.println("second i: " +word.indexOf('i', 4)); // 5
        System.out.println("third i: " + word.indexOf('i', 6)); // 7








    }
}

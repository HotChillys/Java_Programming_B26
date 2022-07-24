package day18_string;

public class EmptyOrBlank {
    public static void main(String[] args) {

        String str = "last example";
        System.out.println(str.isEmpty()); // false

        str = "";
        System.out.println(str.isEmpty()); // true

        String s = " "; // space as a character
        System.out.println("s is empty, " +s.isEmpty()); // false, because there is a space, and space is character

//        if (s.length() == 0) {
//            System.out.println("empty");
//        }
//

        System.out.println("s is blank, " +s.isBlank()); // true

        String s2 = "                    ";
        System.out.println(s2.isEmpty()); // false
        System.out.println(s2.isBlank()); //true















    }
}

package day19_String;

public class MergeStrings {
    public static void main(String[] args) {

       /*
       two Strings : hard code to have 3 characters
       merge the Strings together
       ex:
        */

        String a = "one";
        String b = "TWO";

        System.out.println("" + a.charAt(0) + b.charAt(0) + a.charAt(1) + b.charAt(1) + a.charAt(2) + b.charAt(2));


        // second approach
        String merged = "";
        merged += a.charAt(0); // merged = merged + a.charAt(0)
        merged += b.charAt(0);
        merged += a.charAt(1);
        merged += b.charAt(1);
        merged += a.charAt(2);
        merged += b.charAt(2);

        System.out.println(merged);








    }
}

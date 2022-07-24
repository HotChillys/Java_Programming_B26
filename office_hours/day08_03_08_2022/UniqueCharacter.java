package day08_03_08_2022;

public class UniqueCharacter {
    public static void main(String[] args) {
               /*
        Task 06: Unique Characters

            Write a program that can return the unique chars  from  a  string

            String str = "aabdfccfs";

            Output : bds

            Small Task --> Find me first Unique Char from the String
         */

        String str = "aabdfccfs";

        System.out.println(str.indexOf("f"));
        System.out.println(str.lastIndexOf("f"));

        // dynamic

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            boolean isUnique = str.indexOf(each) == str.lastIndexOf(each);

            if (isUnique) {
                System.out.print(each);
            }

        }







    }
}

package Foo_IQ.mentor_java_tasks;

public class FindUnique {
    /*
        Write a return method that can find the unique characters from the String
        Ex:  unique("AAABBBCCCDEF") ==> "DEF";

     */
    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";
        System.out.println(unique(str));
    }


    public static String unique(String str) {

        String s = "";

        for (int i = 0; i < str.length(); i++) {

            if (!s.contains(str.charAt(i) + "")) {
                s += str.charAt(i);
            }

        }

        return s;
    }
}
// TODO: 2022-06-02

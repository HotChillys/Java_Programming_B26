package Foo_IQ.mentor_java_tasks;

public class RemoveDuplicate {
    /*
        Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC") ==> ABC
     */
    public static void main(String[] args) {
        String str = "AAABBBCCC";
        System.out.println(removeDup(str));
    }

    public static String removeDup(String str) {

        String s = "";

        for (int i = 0; i < str.length(); i++) {

            if (!s.contains(str.charAt(i) + "")) {
                s += str.charAt(i);
            }

        }

        return s;
    }
}

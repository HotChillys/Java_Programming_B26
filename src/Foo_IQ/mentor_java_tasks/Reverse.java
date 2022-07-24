package Foo_IQ.mentor_java_tasks;

public class Reverse {
    /*
    Write a return method that can reverse String
    Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println(reverse(str));
        System.out.println(reverse1("myjava"));
    }

    public static String reverse(String str) {

        String s = "";

        for(int i = str.length()-1; i >= 0; i--){
            s += str.charAt(i);
        }
        return s;
    }

    public static StringBuilder reverse1(String str){

        StringBuilder s = new StringBuilder(str);

        return s.reverse();

    }

}


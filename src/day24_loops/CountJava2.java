package day24_loops;

public class CountJava2 {
    public static void main(String[] args) {

        // another way of doing Count Java task

        String str = "java is a java language.java";
        int count = 0;

        while (str.contains("java")) {

            str = str.replaceFirst("java", "*");
            count++;
        }
        System.out.println(count);
        System.out.println(str);

     // everytime the loop runs, it replaces the first "java" with "*" and add 1 to "count".








    }
}

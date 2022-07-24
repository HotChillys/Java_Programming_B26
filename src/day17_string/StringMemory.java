package day17_string;

public class StringMemory {
    public static void main(String[] args) {

        String first = "java"; // String literal, in directly in the string pool

        String second = new String("java"); // String object not in the string pool, but directly in the heap

        System.out.println(first == second); // == with String types gives you false. the = doesn't compare the character, it compares the memory location of the object

        String third = "java";
        System.out.println(first == third); // true, because they are in the same String pool, same one object

        String fourth = "Java"; // at this line, how much object in the String pool: 2 // " java" and "java"

        System.out.println(first == fourth); // java is case sensitive

        // at his point how many total object is there? 3. --> 2 in the String pool and 1 separate object in the heap


        String fifth = new String("java");
        System.out.println(second == fifth); // it is a new object in the heap





    }
}

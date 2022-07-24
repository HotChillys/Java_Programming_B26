package day17_04_12_2022.CydeoStudent;

import day03_comments_escape_sequence.ShoppingReceipt;

import java.util.ArrayList;
import java.util.Arrays;

public class Cydeo {
    public static void main(String[] args) {

        Student student = new Student("Megan");
        System.out.println(student);
        System.out.println("===========");

        Student student1 = new Student("Mehmet", 25);
        System.out.println(student1);
        System.out.println("============");

        Student student2 = new Student("Tyler", 25, "B26");
        System.out.println(student2);

        Student student3 = new Student("Tammy", 25, "B26");
        Student student4 = new Student("Steve", 25, "B23");
        Student student5 = new Student("Jeff", 25, "B25");
        Student student6 = new Student("Daren", 25, "B24");
        Student student7 = new Student("Lloyd", 25, "B26");

        ArrayList<Student> students = new ArrayList(Arrays.asList(student, student1, student2, student3, student4, student5, student6, student7));

        System.out.println(students);
        System.out.println(students.get(0).name);

        ArrayList<Student> b26Students = new ArrayList<>(students);

        b26Students.removeIf(eachStudent -> eachStudent.batchNumber.equals("B26"));
// TODO: 2022-04-13 above part does not work ,
        System.out.println(b26Students);

    }
}

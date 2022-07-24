package day17_04_12_2022.CydeoStudent;

public class Student {

    String name;
    int age;
    String batchNumber;

    public Student(String name) {
        this.name = name;
        joinClass(name);
    }

    public Student(String name, int age) {
        this(name);
        this.age = age;
    }

    public Student(String name, int age, String batchNumber) {
        this(name, age);
        this.batchNumber = batchNumber;
    }

    public void joinClass(String name) {
        System.out.println(name + " is joining class");
    }

    public String toString(){
        return "Student Info \n{ Name: " + name + " | Age: " + age + " | Batch Number: " + batchNumber + " }";
    }

}

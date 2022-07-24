package day42_custom_classes;

public class AllPeople {
    public static void main(String[] args) {

        // these are not valid ways to access variables.
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(Person.name);
//        System.out.println(Person.age);

        Person personOne = new Person(); // creates an object of Person Class

        Person personTwo = new Person();

        // accessing the instances variable

        personOne.name = "James";
        personOne.age = 40;
        personOne.height = 5.10;
        personOne.isMarried = false;

        // printing the instances variable for personOne

        System.out.println(personOne.name);
        System.out.println(personOne.age);
        System.out.println(personOne.height);
        System.out.println(personOne.isMarried);

        // printing the instances variable for  personTwo

        System.out.println(personTwo.name);
        System.out.println(personTwo.age);
        System.out.println(personTwo.height);
        System.out.println(personTwo.isMarried);

    }
}

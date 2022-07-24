package day49_inheritance;

public class Building {
    public static void main(String[] args) {

        Person obj = new Person();
        obj.name = "James Bond";
        obj.age = 40;
        obj.hobby = "Gaming";
        obj.talk();

        Student obj2 = new Student();
        obj2.name = "Jorgo";
        obj2.age = 10;
        obj2.hobby = "drawing";
        obj2.talk();

        // above variables were inherited from the Peson class

        obj2.funLevel = 100;
        obj2.study();


    }
}

package day21_04_26_2022.accessModifier;

public class AccessModifier {
    public static void main(String[] args) {

        Person person = new Person();

        //1 - public
        person.name = "Mike";

        //2 - private
        //person.age  = 5; // it is not visible

        //3 - default --> in same package
        person.ID = 7106432;

        //4 - protected

            // - same package
            person.DoB = "06.06.2006";

            // - inheritance --> there is no inheritance
            AccessModifier accessModifier = new AccessModifier();
            //accessModifier.DoB = "06.06.2005"; //there is no inheritance.








    }
}

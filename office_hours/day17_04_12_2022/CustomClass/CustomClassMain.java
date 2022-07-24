package day17_04_12_2022.CustomClass;

public class CustomClassMain {
    public static void main(String[] args) {

        new CustomClassIntro();
        // there is no reference to

        System.out.println("==============");
        CustomClassIntro c=new CustomClassIntro();
        System.out.println(c);

        System.out.println("==============");
        // Call instance Var
        c.instanceVariable="Instance Variable from Main Method";
        System.out.println(c);


        System.out.println("==============");
        // Call instance method
        c.instanceMethod();
        System.out.println(c);


        // Create a new OBJECT

        System.out.println("==============");
        CustomClassIntro c2=new CustomClassIntro();
        System.out.println(c2.toString());


    }
}

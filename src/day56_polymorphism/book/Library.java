package day56_polymorphism.book;

public class Library {
    public static void main(String[] args) {

        JavaTextBook book1 = new JavaTextBook();
        book1.name = "Java Programming";
        book1.size = 20.5;
        book1.fun = true;
        book1.read();
        book1.open();
        book1.download();

        System.out.println();

        EBook book2 = new JavaTextBook();
        book2.name = "Java Programming";
        book2.size = 20.5;
        //book2.fun = true; // EBook reference does not have access to 'fun' variable
        ( (JavaTextBook)(book2) ).fun = true; // cast the reference from the parentEBook to the child reference of JavaTextBook and that allows us to access the fun variable
        book2.read();
        book2.open();
        book2.download();

        System.out.println();

        Book book3 = new JavaTextBook();
        book3.name = "Java Programming";
        //book3.size = 20.5;
        //book3.fun = true;
        book3.read();
        //book3.open();
        //book3.download();


        // Book reference only has access to the name variable and read method.

        Downloadable book4 = new JavaTextBook();
//        book4.name = "Java Programming";
//        book4.size = 20.5;
//        book4.fun = true;
//        book4.read();
//        book4.open();
        book4.download();

        // Downloadable interface has only accessible to download method.

        JavaTextBook book5 = (JavaTextBook)book4;
        // book4 was the interface reference, we cast the reference to be a JavaTextBook and assigned it to the book5 reference
        book5.read();
        book5.open();
        book5.fun = false;






    }
}

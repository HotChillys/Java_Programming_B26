package day50_inheritance.book;

public class EBook extends Book{

    /*
Create a class EBook

    - EBook class inherits Book class

    - create additional variables:
        size, pages

    - create method:
        read()
            Example output: prints Reading a digital copy of $title
 */

    double size;
    int pages;

    public void read(){
        System.out.println("Reading a digital copy of: " + title);
    }


}

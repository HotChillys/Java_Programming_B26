package day57_exceptions.webelement;

import java.util.ArrayList;

public class Apple {
    public static void main(String[] args) {

        Form obj = new Form();
        Link obj2 = new Link();
        Input obj3 = new Input();
        Image obj4 = new Image();

        ArrayList<WebElement> elements = new ArrayList<>(); // ArrayList of WebElement. which means the object implement the WebElement interface
        elements.add(obj);
        elements.add(obj2);
        elements.add(obj3);
        elements.add(obj4);
        elements.add(new Form());

        for (WebElement each : elements) {
            System.out.println(each.getText());
            if (each instanceof Form) {
                ((Form) each).submit();
            }
        }

        WebElement logo = new Image();
        logo.click(); // click method is accessible by the WebElement interface, then execution happens ob object side

        //logo.extension = ".png"; // WebElement interface does not have accessibility to the variable

        ((Image)logo).extension = ".png";

        //((Image)logo) --> cast the logo (WebElement reference) to a Image reference, then the Image reference as access to the extension variable.

        // option 2:

        Image logoAsImage = ((Image) logo);
        logoAsImage.extension = ".png";









    }
}
/*
without instanceof part you would be trying to cast all the object to Form, but object doesn't have a relation to Form

(Form) link object
(From) image object
(Form) input object
 */
package day43_custom_classes;

public class UsePhone {
    public static void main(String[] args) {



        Phone phone1 = new Phone("Iphone", "Apple", 128, 5.3);
        System.out.println(phone1);
        System.out.println();

        Phone phone2 = new Phone("Iphone", "Apple");
        System.out.println(phone2);
        System.out.println();

        Phone phone3 = new Phone("Iphone 12");
        System.out.println(phone3);
        System.out.println();



    }
}

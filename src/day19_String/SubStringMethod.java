package day19_String;

public class SubStringMethod {
    public static void main(String[] args) {

        String str = "sunday";
        //            012345

        System.out.println(str.substring(1)); // unday
        System.out.println(str.substring(3)); // day
        System.out.println(str);
        System.out.println("satur" + str.substring(3)); // saturday

        System.out.println(str.substring(2, 4)); // nd
        System.out.println(str.substring(0, 5)); // sunda
        System.out.println(str.substring(0, 6)); // sunday
//        System.out.println(str.substring(0, 7)); // error




    }
}

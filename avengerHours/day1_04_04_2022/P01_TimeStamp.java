package day1_04_04_2022;

public class P01_TimeStamp {
    /*
    Write a method that accepts a String (date with time) and creates a timeStamp for your automation report

         String date= "10/10/2022 14:59:00";
          timeStamp(date); // 10102020145900
     */

    public static void main(String[] args) {
        String date = "10/10/2022 14:59:00";

        date = date.replace("/", "");
        date = date.replace(" ", "");
        date = date.replace(":", "");
        System.out.println(date);

        System.out.println(timeStamp(date));

    }

    public static String timeStamp(String date){

        return date.replace(
                "/", "")
                .replace(" ", "")
                .replace("/", "");
    }




}

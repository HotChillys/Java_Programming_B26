package day15_04_05_2022;

public class SumOfAllInteger2 {
    public static void main(String[] args) {

        String s="jav45ai1000sgre1at82".toLowerCase();
        System.out.println(sumOfDigits(s));

    }

    public static int sumOfDigits(String str) {

        String digits = "0";
        //String s = "jav45ai1000sgre1at82";

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {

                digits += str.charAt(i);

            } else {
                sum+= Integer.parseInt(digits);
                digits = "0";
            }


        }
        return sum+Integer.parseInt(digits);

    }
}

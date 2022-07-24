package day07_03_08_2022;

public class EncryptPassword {
    public static void main(String[] args) {
        /*
           Given a string password. Encrypt with "x" a given password and print.
               * password: cydeo
               * encrypt with char :x
               * output:cxyxdxexox
         */

        String password = "cydeo";
        String encryptPassword = "";

        for (int i = 0; i < password.length(); i++) {

            encryptPassword += password.charAt(i) + "x";

        }

        System.out.println(encryptPassword);








    }
}

package Foo_IQ.mentor_java_tasks;

public class PasswordValidation {
    /*
    Write a return method that can verify if a password is valid or not. Requirements:
    1. Password MUST be at least 6 characters and should not contain space
    2. Password should at least contain one upper case letter
    3. Password should at least contain one lowercase letter
    4. Password should at least contain one special characters
    5. Password should at least contain a digit
    6. if all requirements above are met, the method returns true, otherwise returns false
     */

    public static boolean validPassword(String s) {

        int isDigit = 0;
        int isUppercase = 0;
        int isLowercase = 0;
        int isSpecial = 0;

        if (s.contains(" ") || s.length() < 6) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                isDigit++;
            } else if (Character.isLowerCase(s.charAt(i))) {
                isLowercase++;
            } else if (Character.isUpperCase(s.charAt(i))) {
                isUppercase++;
            } else {
                isSpecial++;
            }
        }
        if (isDigit > 0 && isLowercase > 0 && isUppercase > 0 && isSpecial > 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(validPassword("KJHhggyg65656"));
    }
}

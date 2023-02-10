package fast_track;

public class Task5FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "aaaabcccdd";
        String result = "";

        while (!str.isEmpty()) {
            int origLength = str.length();
            String currentChar = str.substring(0,1);
            str = str.replace(currentChar, "");
            result += currentChar + (origLength - str.length());
        }

        System.out.println(result);
    }

}

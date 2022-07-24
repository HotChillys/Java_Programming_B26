package day12_03_22_2022;

public class RemoveSpaceMehmetWay {
    public static void removeSpaces(String str) {
        String [] s = str.split(" ");
        String result = "";

        for (String each : s) {
            if(!each.isEmpty()) {
                result += each + " ";
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String sentence =  "  Hello world      I      love      Java    ";
        removeSpaces(sentence);
    }
    }

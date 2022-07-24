package day30_array;

public class LongestPalindrome {
    public static void main(String[] args) {
        /*
        Given a String array. Find the longest Palindrome String in your array.
        Ex:
        Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”]
        Output: racecar
        Ex:
        Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
        Output: No palindrome
         */
        String[] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna" };

        String longestPalindrome = "";

        //outer loop is iterating through the array
        for (String eachWord : words) { // eachWord ==  words[i]
            boolean isPalindrome = true;

            //inner loop is iterating through each String element
            for (int i = 0; i < eachWord.length() / 2; i++) {
                if (eachWord.charAt(i) != eachWord.charAt(eachWord.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }

            }
            if (isPalindrome && eachWord.length() > longestPalindrome.length()) {
                longestPalindrome = eachWord;
            }

        }
        System.out.println(longestPalindrome.isEmpty() ? "No Palindrome" : longestPalindrome);

    }
}

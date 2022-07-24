package Foo_IQ;

public class RomanNumbers {
    /*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.



Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
     */
    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println(romanNumber(s));
    }

    public static int romanNumber(String str) {
        int m = 1000;
        int d = 500;
        int c = 100;
        int l = 50;
        int x = 10;
        int v = 5;
        int I = 1;

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            switch (str.charAt(i)) {
                case 'M':
                    sum += m;
                    break;
                case 'D':
                    sum += d;
                    break;
                case 'C':
                    if (i+1 < str.length() && str.charAt(i + 1) == 'D') {
                        sum += (d - c);
                    } else if (i+1 < str.length() && str.charAt(i + 1) == 'M') {
                        sum += (m - c);
                    }
                    i++;
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'X':
                    if (i+1 < str.length() && str.charAt(i + 1) == 'L') {
                        sum += (l - x);
                    } else if (i+1 < str.length() && str.charAt(i + 1) == 'C') {
                        sum += (c - x);
                    }
                    i++;
                    break;
                case 'V':
                    sum += v;
                    break;
                case 'I':
                    if (i+1 < str.length() && str.charAt(i + 1) == 'V') {
                        sum += (v - I);
                        i++;
                    } else if (i+1 < str.length() && str.charAt(i + 1) == 'X') {
                        sum += (x - I);
                        i++;
                    } else {
                        sum += 1;
                    }
                    break;
            }
        }
        return sum;
    }


}

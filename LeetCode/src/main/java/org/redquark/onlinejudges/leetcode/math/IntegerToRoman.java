package org.redquark.onlinejudges.leetcode.math;

/**
 * @author Anirudh Sharma
 */
public class IntegerToRoman {

    public String intToRoman(int num) {
        // Special case
        if (num < 1) {
            throw new IllegalArgumentException("Invalid input");
        }
        // Arrays to store the combination of ones, tens, hundreds
        // and thousands places
        String[] thousands = new String[]{"", "M", "MM", "MMM"};
        String[] hundreds = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCC", "CM"};
        String[] tens = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return thousands[num / 1000] + hundreds[(num % 1000) / 100] + tens[(num % 100) / 10] + ones[num % 10];
    }
}

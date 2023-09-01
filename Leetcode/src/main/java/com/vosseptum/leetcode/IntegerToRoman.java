package com.vosseptum.leetcode;

public class IntegerToRoman {

    public String intToRoman(int num) {
        String m = "M";
        String d = "D";
        String c = "C";
        String l = "L";
        String x = "X";
        String v = "V";
        String i = "I";
        return stringForDigit(num / 1000, m, "", "") + stringForDigit((num / 100) % 10, c, d, m) +
                stringForDigit((num / 10) % 10, x, l, c) + stringForDigit(num % 10, i, v, x);
    }

    private String stringForDigit(int digit, String smallest, String middle, String highest) {
        if (digit == 0) {
            return "";
        } else if (digit < 4) {
            return smallest.repeat(digit);
        } else if (digit < 9) {
            return smallest.repeat(Math.max(0, 5 - digit)) + middle + smallest.repeat(Math.max(0, digit - 5));
        } else {
            return smallest + highest;
        }
    }

    public String bestSolution(int num) {
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hrns = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] ths = {"", "M", "MM", "MMM"};

        return ths[num / 1000] + hrns[(num % 1000) / 100] + tens[(num % 100) / 10] + ones[num % 10];
    }
}

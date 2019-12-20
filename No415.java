/*
415.Add String

Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
*/

class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int carry = 0; 
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;
        while (len1 >= 0 || len2 >= 0 || carry != 0) {
            if (len1 >= 0) {
                carry += num1.charAt(len1--) - '0';
            }
            if (len2 >= 0) {
                carry += num2.charAt(len2--) - '0';
            }
            res.append(carry % 10);
            carry /= 10;
        }
        return res.reverse().toString();
    }
}

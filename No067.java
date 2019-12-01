/*
67.Add Binary

Given two binary strings, return their sum (also a binary string).

The input strings are both non-empty and contains only characters 1 or 0.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
*/

class Solution {
    public String addBinary(String a, String b) {
        if (a.length() == 0) {
            return b;
        } else if (b.length() == 0) {
            return a;
        }
        StringBuilder res = new StringBuilder();
        int alen = a.length() - 1;
        int blen = b.length() - 1;
        int carry = 0;
        while (0 <= alen || 0 <= blen || carry == 1) {
            int count = carry;
            if (0 <= alen) count += a.charAt(alen--) - '0';
            if (0 <= blen) count += b.charAt(blen--) - '0';
            res.append(count % 2);
            carry = count / 2;
        }
        return res.reverse().toString();
    }
}

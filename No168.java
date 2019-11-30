/*
168. Excel Sheet Column Titie

Given a positive integer, return its corresponding column title as appear in an Excel sheet.
For example:
    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
    ...
Example 1:
Input: 1
Output: "A"

Example 2:
Input: 28
Output: "AB"

Example 3:
Input: 701
Output: "ZY"
*/

class Solution {
    public String convertToTitle(int n) {
        String str = new String();
        int res = 0;
        while (n != 0) {
            res = n % 26;
            if (res == 0) {
                str = 'Z' + str;
                n = n / 26 - 1;
            } else {
                str = (char) (res + 'A' - 1) + str;
                n /= 26;
            }
        }
        return str;
    }
}

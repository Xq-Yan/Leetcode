/*
459.Repeated Substring Pattern

Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.

Example 1:

Input: "abab"
Output: True
Explanation: It's the substring "ab" twice.
Example 2:

Input: "aba"
Output: False
Example 3:

Input: "abcabcabcabc"
Output: True
Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
*/

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if (s == null) return false;
        if (s.length() == 1) return false;
        if (s.split(String.valueOf(s.charAt(0))).length == 0) return true;
        for (int i = s.length() - 1; i >= 2; i--) {
            if (s.length() % i == 0) {
                String str = s.substring(0, i);
                String arr[] = s.split(str);
                if (arr.length == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}

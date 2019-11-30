/*
14.Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String res;
        for (int i = strs[0].length(); i >= 0; i--) {
            res = strs[0].substring(0, i);
            if (validate(strs, res)) {
                return res;
            }
        }
        return "";
    }

    public static boolean validate(String[] strs, String res) {
        for (int j = 1; j < strs.length; j++) {
            if (!strs[j].startsWith(res)) {
                return false;
            }
        }
        return true;
    }
}

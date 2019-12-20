/*
290.Word Pattern

Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1:

Input: pattern = "abba", str = "dog cat cat dog"
Output: true
Example 2:

Input:pattern = "abba", str = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", str = "dog cat cat dog"
Output: false
Example 4:

Input: pattern = "abba", str = "dog dog dog dog"
Output: false
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.
*/

class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] array = str.split(" ");
        if (pattern.length() != array.length) return false;
        int len = pattern.length();
        for (int i = 0; i < len; i++) {
            if (pattern.indexOf(pattern.charAt(i)) != indexOf(array, array[i])) {
                return false;
            }
        }
        return true;
    }

    public static int indexOf(String[] arrays, String searchStr) {
        int res = -1;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].equals(searchStr)) {
                res = i;
                break;
            }
        }
        return res;
    }
}

/*
345.Reverse Vowels of a String

Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:

Input: "hello"
Output: "holle"
Example 2:

Input: "leetcode"
Output: "leotcede"
Note:
The vowels does not include the letter "y".
*/

class Solution {
    public String reverseVowels(String s) {
         if (s == null) {
            return "";
        }
        List<Character> list = new ArrayList<>();
        list.add('A');
        list.add('a');
        list.add('E');
        list.add('e');
        list.add('I');
        list.add('i');
        list.add('O');
        list.add('o');
        list.add('U');
        list.add('u');
        char[] str = s.toCharArray();
        int i = 0;
        int j = str.length - 1;

        while (i < j) {
            if (list.contains(str[i])) {
                if (list.contains(str[j])) {
                    char tempChar = str[i];
                    str[i] = str[j];
                    str[j] = tempChar;
                    i++;
                    j--;
                } else {
                    j--;
                }
            } else {
                i++;
            }
        }
        return String.valueOf(str);
    }
}

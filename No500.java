/*
500.Keyboard Row

Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.

Example:

Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]
 
Note:

You may use one character in the keyboard more than once.
You may assume the input string will only contain letters of alphabet.
*/

class Solution {
    public String[] findWords(String[] words) {
        String[] res = new String[words.length];
        String first = "qwertyuiopQWERTYUIOP";
        String second = "asdfghjklASDFGHJKL";
        String third = "zxcvbnmZXCVBNM";
        int k = 0;
        for (int i = 0; i < words.length; i++) {
            String temp = "";
            for (int j = 0; j < words[i].length(); j++) {
                if (first.indexOf(words[i].charAt(0)) != -1) {
                    temp = first;
                } else if (second.indexOf(words[i].charAt(0)) != -1) {
                    temp = second;
                } else {
                    temp = third;
                }
                if (temp.indexOf(words[i].charAt(j)) == -1) break;
                if (temp.indexOf(words[i].charAt(j)) != -1 && j == words[i].length() - 1) {
                    res[k] = words[i];
                    k++;
                }
            }
        }
        String[] result = new String[k];
        for (int n = 0; n < k; n++) {
            result[n] = res[n];
        }
        return result;
    }
}

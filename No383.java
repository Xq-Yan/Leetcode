/*
383.Ransom Note

Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
*/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] words = new int[26];
        for(int i = 0; i < ransomNote.length(); i++){
            char cur = ransomNote.charAt(i);
            words[cur - 'a']++;
        }
        int len = ransomNote.length();
        for(int i = 0; i < magazine.length() && len > 0; i++){
            char cur = magazine.charAt(i);
            if(words[cur - 'a'] != 0){
                len--;
                words[cur - 'a']--;
            }
        }
        return len == 0;
    }
}

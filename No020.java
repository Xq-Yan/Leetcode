/*
20.Vaild Parentheses

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true
*/
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        if (s.length() == 0) return true;
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else if (stack.isEmpty() || (s.charAt(i) - stack.peek() != 1 && s.charAt(i) - stack.peek() != 2)) {
                return false;
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}

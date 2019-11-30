/*
38.Count and Say

The count-and-say sequence is the sequence of integers with the first five terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.

Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.

Note: Each term of the sequence of integers will be represented as a string.
Example 1:

Input: 1
Output: "1"
Example 2:

Input: 4
Output: "1211"
*/

class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String str = "1";
        for (int i = 0; i < n - 1; i++) {
            StringBuffer res = new StringBuffer();
            int count = 0;
            char t = str.charAt(0);
            for (int j = 0; j < str.length(); j++) {
                if (t == str.charAt(j)) {
                    count++;
                } else {
                    res.append(count);
                    res.append(t);
                    t = str.charAt(j);
                    count = 1;
                }
            }
            res.append(count);
            res.append(str.charAt(str.length() - 1));
            str = res.toString();
        }
        return str;
    }
}

/*
202.Happy Number

Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 

Input: 19
Output: true
Explanation: 
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
*/

class Solution {
    public boolean isHappy(int n) {
       /*if (n == 1) return true;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);
        while (n != 1) {
            String[] num = String.valueOf(n).split("");
            n = 0;
            for (int i = 0; i < num.length; i++) {
                n += Integer.parseInt(num[i]) * Integer.parseInt(num[i]);
            }
            for (int i = 0; i < list.size(); i++) {
                if (n == list.get(i)) return false;
            }
            list.add(n);
            if (n == 1) return true;
        }
        return false;*/
        
        //Only comes to 1 when n=1 && n=7.
        while (n >= 10) {
            int m = n, res = 0;
            while (m != 0) {
                int t = m % 10;
                res += t * t;
                m /= 10;
            }
            n = res;
        }
        return n == 1 || n == 7;    }
}

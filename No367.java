/*
367.Valid Perfect Square

Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:

Input: 16
Output: true
Example 2:

Input: 14
Output: false
*/

class Solution {
    public boolean isPerfectSquare(int num) {
       int l = 0, r = num, mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (mid == (num * 1.0 / mid)) {
                return true;
            } else if (mid > (num * 1.0 / mid)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false; 
    }
}

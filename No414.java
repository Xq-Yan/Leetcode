/*
414.Third Maximum Number

Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:
Input: [3, 2, 1]

Output: 1

Explanation: The third maximum is 1.
Example 2:
Input: [1, 2]

Output: 2

Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
Example 3:
Input: [2, 2, 3, 1]

Output: 1

Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.
*/

class Solution {
    public int thirdMax(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        long a = Long.MIN_VALUE, b = a, c = a;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > a) {
                c = b;
                b = a;
                a = nums[i];
            }
            if (nums[i] < a && nums[i] > b) {
                c = b;
                b = nums[i];
            }
            if (nums[i] < b && nums[i] > c) {
                c = nums[i];
            }
        }
        if (c == Long.MIN_VALUE) return (int)a;
        return (int)c;
    }
}

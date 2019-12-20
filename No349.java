/*
349.Intersection of Two Arrays

Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Note:

Each element in the result must be unique.
The result can be in any order.
*/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums1.length; i++) set1.add(nums1[i]);
        for (int i = 0; i < nums2.length; i++) set2.add(nums2[i]);
        for (int num : set1) {
            if (set2.contains(num)) list.add(num);
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i).intValue();
        }
        return res;
    }
}

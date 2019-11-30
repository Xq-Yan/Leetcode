/*
118.Pascal's Triangle

Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:
Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        int[][] res = new int[numRows][numRows];
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> list1 = null;
        if (numRows == 0) return list;
        for (int i = 0; i < numRows; i++) {
            res[i][0] = 1;
            list1 = new ArrayList<Integer>();
            list1.add(res[i][0]);
            for (int j = 1; j <= i; j++) {
                res[i][j] = res[i - 1][j - 1] + res[i - 1][j];
                list1.add(res[i][j]);
            }
            list.add(list1);
        }
        return list;
    }
}

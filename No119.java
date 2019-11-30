/*
119.Pascal's Triangle2
Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
Note that the row index starts from 0.
Example:
Input: 3
Output: [1,3,3,1]
*/

/*class Solution {
    public List<Integer> getRow(int rowIndex) {
        int[][] res = new int[rowIndex + 1][rowIndex + 1];
        List<Integer> list1 = null;
        for (int i = 0; i <= rowIndex; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    res[i][j] = 1;
                    list1 = new ArrayList<Integer>();
                    list1.add(res[i][j]);
                } else {
                    res[i][j] = res[i - 1][j - 1] + res[i - 1][j];
                    list1.add(res[i][j]);
                }
            }
        }
        return list1;
    }
}*/
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        double num = 1;
        if (rowIndex == 0) return res;
        for (int i = 1; i < rowIndex + 1; i++) {
            num = num * (rowIndex+1 - i) / i;
            res.add((int) num);
        }
        return res;
    }
}


/*
110.Balanced Binary Tree

Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as:

a binary tree in which the left and right subtrees of every node differ in height by no more than 1.

 

Example 1:

Given the following tree [3,9,20,null,null,15,7]:

    3
   / \
  9  20
    /  \
   15   7
Return true.

Example 2:

Given the following tree [1,2,2,3,3,null,null,4,4]:

       1
      / \
     2   2
    / \
   3   3
  / \
 4   4
Return false.
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
class Solution {
    public boolean isBalanced(TreeNode root) {
        return len(root) >= 0;
    }

    public int len(TreeNode root) {
        if (root == null) return 0;
        int leftlen = len(root.left);
        if (leftlen < 0) return -1;
        int rightlen = len(root.right);
        if (rightlen < 0) return -1;
        if (Math.abs(leftlen - rightlen) > 1) return -1;
        return Math.max(leftlen, rightlen) + 1;
    }
}

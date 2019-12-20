/*
257.Binary Tree Paths

Given a binary tree, return all root-to-leaf paths.

Note: A leaf is a node with no children.

Example:

Input:

   1
 /   \
2     3
 \
  5

Output: ["1->2->5", "1->3"]

Explanation: All root-to-leaf paths are: 1->2->5, 1->3
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
 
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList();
        if (root == null) return res;
        road(root, "", res);
        return res;
    }

    public void road(TreeNode root, String cur, List<String> res) {
        if (root == null) return;
        cur += root.val;
        if (root.left == null && root.right == null) {
            res.add(cur);
        } else {
            road(root.left, cur + "->", res);
            road(root.right, cur + "->", res);
        }
    }
}

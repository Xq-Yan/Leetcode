/*
101.Symmetric Tree

Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
 

But the following [1,2,2,null,3,null,3] is not:

    1
   / \
  2   2
   \   \
   3    3
 

Note:
Bonus points if you could solve it both recursively and iteratively.
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
    public boolean isSymmetric(TreeNode root) {
        /*if (root == null) return true;
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(root);
        q2.add(root);
        while (!q1.isEmpty() && !q2.isEmpty()) {
            TreeNode l = q1.poll();
            TreeNode r = q2.poll();
            if (l == null && r == null) continue;
            if (l == null || r == null) return false;
            if (l.val != r.val) return false;
            q1.add(l.left);
            q1.add(l.right);
            q2.add(r.right);
            q2.add(r.left);
        }
        return q1.isEmpty() && q2.isEmpty();*/
        return ismirror(root, root);
    }

    public boolean ismirror(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if ((p != null && q != null) && (p.val == q.val)) {
            return ismirror(p.left, q.right) && ismirror(p.right, q.left);
        } else {
            return false;
        }
    }
}

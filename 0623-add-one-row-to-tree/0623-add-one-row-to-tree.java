/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private TreeNode bfs(TreeNode root, int val, int depth) {
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int level = 1;
        while (q.size() > 0) {
            int count = q.size();
            while (count-- > 0) {
                TreeNode rem = q.poll();
                if (level == depth - 1) {
                    TreeNode left = rem.left;
                    TreeNode right = rem.right;
                    rem.left = new TreeNode(val);
                    rem.right = new TreeNode(val);
                    rem.left.left = left;
                    rem.right.right = right;
                } else {
                    if (rem.left != null) {
                        q.add(rem.left);
                    }
                    if (rem.right != null) {
                        q.add(rem.right);
                    }
                }
            }
            level++;
        }
        return root;
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newNode = new TreeNode(val);
            newNode.left = root;
            return newNode;
        }
        return bfs(root, val, depth);
    }
}
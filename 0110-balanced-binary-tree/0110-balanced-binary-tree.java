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

    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    public int height(TreeNode node) {
        // 1. Base Case
        if (node == null)
            return 0;

        // 2. Left Check & Immediate Short-Circuit
        int leftHeight = height(node.left);
        if (leftHeight == -1) 
            return -1;

        // 3. Right Check & Immediate Short-Circuit
        int rightHeight = height(node.right);
        if (rightHeight == -1) 
            return -1;

        // 4. Current Node Balance Check
        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;

        // 5. All Good: Return the actual height
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
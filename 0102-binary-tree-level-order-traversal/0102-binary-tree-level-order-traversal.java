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
 
import java.util.*;

class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        // Empty tree
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        // Put root in queue
        queue.offer(root);

        while (!queue.isEmpty()) {

            // Number of nodes in current level
            int size = queue.size();

            List<Integer> level = new ArrayList<>();

            // Process one complete level
            for (int i = 0; i < size; i++) {

                TreeNode current = queue.poll();

                level.add(current.val);

                // Add left child
                if (current.left != null) {
                    queue.offer(current.left);
                }

                // Add right child
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }

            result.add(level);
        }

        return result;
    }
}

/*from collections import deque

class Solution:
    def levelOrder(self, root):

        result = []

        if not root:
            return result

        queue = deque([root])

        while queue:

            size = len(queue)

            level = []

            for i in range(size):

                current = queue.popleft()

                level.append(current.val)

                if current.left:
                    queue.append(current.left)

                if current.right:
                    queue.append(current.right)

            result.append(level)

        return result
        */
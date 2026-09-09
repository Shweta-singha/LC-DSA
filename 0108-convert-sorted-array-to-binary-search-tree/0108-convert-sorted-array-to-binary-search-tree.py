class Solution:
    def sortedArrayToBST(self, nums: List[int]) -> Optional[TreeNode]:

        def build(left, right):

            # No elements left
            if left > right:
                return None

            # Choose middle element
            mid = (left + right) // 2

            # Create root
            root = TreeNode(nums[mid])

            # Build left subtree
            root.left = build(left, mid - 1)

            # Build right subtree
            root.right = build(mid + 1, right)

            return root

        # Start with the entire array
        return build(0, len(nums) - 1)
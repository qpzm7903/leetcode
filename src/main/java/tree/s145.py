# Definition for a binary tree node.


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def postorderTraversal(self, root: TreeNode) -> list[int]:
        if not root:
            return []
        result = []
        stack = []
        pre = None
        while stack or root:
            while root:
                stack.append(root)
                result.append(root.val)
                root = root.right
            root = stack.pop()
            if not root.left or root.right == pre:
                result.append(root.val)
                pre = root
                root = None
            else:
                root = root.right
        return result



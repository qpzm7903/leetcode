package tree.traversal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tree.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostorderTraversalTest {

    @Test
    void test_simple() {
        TreeNode root = new TreeNode(1);
        TreeNode root_left = new TreeNode(2);
        TreeNode root_right = new TreeNode(3);

        root.left = root_left;
        root.right = root_right;

        TreeNode[] postOrder = {root_left, root_right, root};

        List<TreeNode> treeNodes = PostorderTraversal.postorderTraversalByRecurse(root);
        treeNodes.forEach(System.out::println);
        Assertions.assertArrayEquals(postOrder, treeNodes.toArray());
        Assertions.assertArrayEquals(postOrder, PostorderTraversal.postorderTraversalByIter(root).toArray());

    }

}
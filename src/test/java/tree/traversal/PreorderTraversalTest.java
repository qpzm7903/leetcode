package tree.traversal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tree.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PreorderTraversalTest {
    @Test
    void test_inorder_traversal() {
        TreeNode root = new TreeNode(1);
        TreeNode root_left = new TreeNode(2);
        TreeNode root_right = new TreeNode(3);
        TreeNode root_left_left = new TreeNode(4);
        TreeNode root_left_right = new TreeNode(5);
        TreeNode root_left_left_left = new TreeNode(6);

        root.left = root_left;
        root.right = root_right;

        root_left.left = root_left_left;
        root_left.right = root_left_right;

        root_left_left.left = root_left_left_left;

        List<TreeNode> treeNodes_1 = PreorderTraversal.preorderTraversalByIter(root);
        List<TreeNode> treeNodes_2 = PreorderTraversal.preorderTraversalByRecurse(root);

        Assertions.assertArrayEquals(treeNodes_2.toArray(), treeNodes_1.toArray());
        treeNodes_1.stream().forEach(System.out::println);



    }
}
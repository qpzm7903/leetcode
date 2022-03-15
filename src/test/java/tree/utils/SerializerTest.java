package tree.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

/**
 * todo description
 *
 * @author qpzm7903
 * @since 2022-03-15-21:40
 */
class SerializerTest {

    @Test
    void test() {
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

        String serializer = Serializer.serializer(root);
        Assertions.assertEquals("1,2,4,6,#,#,#,5,#,#,3,#,#", serializer);

        TreeNode treeNode = Serializer.deSerializer(serializer);
        Assertions.assertEquals(treeNode, root);

    }

}
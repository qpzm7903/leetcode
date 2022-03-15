package tree.utils;

import tree.TreeNode;

/**
 * todo description
 *
 * @author qpzm7903
 * @since 2022-03-15-21:38
 */
public class Serializer {

    /**
     * 输出前序遍历序列化的结果，空节点以#表示
     *
     * @param root
     * @return
     */
    public static String serializer(TreeNode root) {
        if (root == null) {
            return "#";
        }
        String left = serializer(root.left);
        String right = serializer(root.right);
        return String.valueOf(root.val) + "," + left + "," + right;
    }

    /**
     * 将 {@link Serializer#serializer(TreeNode)}的结果反序列化
     *
     * @param data
     * @return
     */
    public static TreeNode deSerializer(String data) {
        String[] nodeStrs = data.split(",");
        int[] i = {0};
        return dfs(nodeStrs,i);


    }

    private static TreeNode dfs(String[] nodeStrs, int[] i) {
        String nodeStr = nodeStrs[i[0]];
        i[0]++;
        if (nodeStr.equals("#")) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.valueOf(nodeStr));
        node.left = dfs(nodeStrs,i);
        node.right = dfs(nodeStrs,i);
        return node;
    }

}

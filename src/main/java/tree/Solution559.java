package tree;

/**
 * @author qpzm7903
 * @since 2020-04-22-7:22
 */

public class Solution559 {
    public int maxDepth(Node root) {
        return dfs(root,1);
    }
    int dfs(Node root, int depth){
        if (root == null){
            return depth;
        }
        int currDepth = depth;
        for (int i = 0; i < root.children.size(); i++) {
            currDepth = Math.max(dfs(root.children.get(i), depth), currDepth);
        }
        return currDepth+1;
    }
}

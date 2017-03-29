package binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by xuan on 2017/3/29 0029.
 */
public class LevelTraverse {
    public void bfs(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode node = null;
        while (!queue.isEmpty()) {
            node = queue.remove();
            visit(node);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
    }

    private void visit(TreeNode node) {
    }
}

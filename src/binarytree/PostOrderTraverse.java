package binarytree;

/**
 * Created by xuan on 2017/3/29 0029.
 */
public class PostOrderTraverse {
    public void afterTraverse(TreeNode root) {
        if (root == null) return;
        afterTraverse(root.left);
        afterTraverse(root.right);
        visit(root);
    }

    private void visit(TreeNode root) {
    }
}

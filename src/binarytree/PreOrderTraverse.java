package binarytree;

/**
 * Created by xuan on 2017/3/29 0029.
 */
public class PreOrderTraverse {
    public void beforeTraverse(TreeNode root) {
        if (root == null) return;
        visit(root);
        beforeTraverse(root.left);
        beforeTraverse(root.right);
    }

    private void visit(TreeNode root) {
    }
}

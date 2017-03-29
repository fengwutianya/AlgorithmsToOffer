package binarytree;

/**
 * Created by xuan on 2017/3/29 0029.
 */
public class InOrderTraverse {
    public void betweenTraverse(TreeNode root) {
        if (root == null) return;
        betweenTraverse(root.left);
        visit(root);
        betweenTraverse(root.right);
    }

    private void visit(TreeNode root) {

    }
}

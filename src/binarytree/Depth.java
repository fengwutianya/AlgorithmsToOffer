package binarytree;

/**
 * Created by xuan on 2017/3/29 0029.
 */
public class Depth {
    public int getDepth(TreeNode root) {
        if (root == null) return 0;
        int depthLeft = getDepth(root.left);
        int depthRight = getDepth(root.right);
        //递归，左子树深度 右子树深度 最大者 加1
        return 1 + (depthLeft > depthRight ? depthLeft : depthRight);
    }
}

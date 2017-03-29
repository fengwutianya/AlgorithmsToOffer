package binarytree;

/**
 * Created by xuan on 2017/3/29 0029.
 */
public class NodeNumber {
    public int getNodeNum(TreeNode root) {
        if (root == null)
            return 0;
        //递归 树的节点数为左子树节点数 + 右子树节点数 + 1
        return 1 + getNodeNum(root.left) + getNodeNum(root.right);
    }
}

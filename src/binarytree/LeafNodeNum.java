package binarytree;

import org.junit.Test;

/**
 * Created by xuan on 2017/3/29 0029.
 */
public class LeafNodeNum {
    public int getLeafNodeNum(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return getLeafNodeNum(root.left) + getLeafNodeNum(root.right);
    }

    @Test
    public void test() {
        TreeNode root = null;
        root = new TreeNode(1);
        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.right.left = new TreeNode(4);
        System.out.println(getLeafNodeNum(root));
        System.out.println(getLeafNodeNum(null));
        System.out.println(getLeafNodeNum(new TreeNode(2)));
    }
}

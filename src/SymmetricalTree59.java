import binarytree.TreeNode;

/**
 * Created by xuan on 2017/3/28 0028.
 */
public class SymmetricalTree59 {
    boolean isSym = true;

    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) return true;
        compare(pRoot.left, pRoot.right);
        return isSym;
    }

    private void compare(TreeNode tree1, TreeNode tree2) {
        if (tree1 != null && tree2 != null) {
            if (tree1.val != tree2.val) {
                isSym = false;
                return;
            }
            compare(tree1.left, tree2.right);
            compare(tree1.right, tree2.left);
        } else if (tree1 != tree2) {    //至少一个为null的情况，只有两个都为null才对称
            isSym = false;
        }
    }
}

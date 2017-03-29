package binarytree;

import org.junit.Test;

/**
 * Created by xuan on 2017/3/29 0029.
 */
public class LevelNum {
    public int getLevelNum(TreeNode root, int level) {
        if (level < 1) throw new IllegalArgumentException("level < 1");
        if (root == null) return 0;
        if (level == 1) return 1;
        return getLevelNum(root.left, level-1) + getLevelNum(root.right, level-1);
    }

    @Test
    public void test() {
        TreeNode root = null;
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        System.out.println(getLevelNum(root, 1));
        System.out.println(getLevelNum(root, 2));
        System.out.println(getLevelNum(root, 3));
        System.out.println(getLevelNum(root,100));
        System.out.println(getLevelNum(null, 1));
        System.out.println(getLevelNum(root, 0));
    }
}

package binarytree;

import org.junit.Test;

/**
 * Created by xuan on 2017/3/29 0029.
 */
public class BinarySearchTreeToDoubleDirectionLinkedList {
    public LinkedNode getDDList(TreeNode root) {
        if (root == null) return null;
        if (root.left == null) {
            LinkedNode curr = new LinkedNode(root.val);
            curr.next = getDDList(root.right);
            return curr;
        } else {
            LinkedNode left = getDDList(root.left);
            LinkedNode last = getLast(left);
            root.left = null;
            last.next = getDDList(root);
            return left;
        }
    }

    private LinkedNode getLast(LinkedNode left) {
        LinkedNode last = left;
        while (last.next != null) last = last.next;
        return last;
    }

    @Test
    public void test() {
        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(3);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(16);
        root.right.right = new TreeNode(100);
        LinkedNode left = getDDList(root);
        System.out.println(left);
    }
}

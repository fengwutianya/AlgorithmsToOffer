import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * Created by xuan on 2017/3/28 0028.
 */
public class TreeToLIne60 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> finaResult = new ArrayList<ArrayList<Integer>>();
        if (pRoot == null) return finaResult;

        Queue<TreeNode> q1 = new ArrayDeque<TreeNode>();
        Queue<TreeNode> q2 = new ArrayDeque<TreeNode>();
        q1.add(pRoot);
        while (true) {
            if (q1.size() == 0) break;
            ArrayList<Integer> result = new ArrayList<Integer>();
            TreeNode node = null;
            while (q1.size() != 0) {
                node = q1.remove();
                if (node != null) {
                    result.add(node.val);
                    //以后记着树的子节点添加到站或者队列，都要先判断，不要把空叶子填进去
                    if (node.left != null) q2.add(node.left);
                    if (node.right != null) q2.add(node.right);
                }
            }
            if (result.size() != 0) finaResult.add(result);
            Queue<TreeNode> temp = q1;
            q1 = q2;
            q2 = temp;
        }
        return finaResult;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        ArrayList<ArrayList<Integer>> result = new TreeToLIne60().Print(root);
        System.out.println(result);
    }
}

import java.util.*;

/**
 * Created by xuan on 2017/3/28 0028.
 */
public class Zhi61 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        Stack<TreeNode> s1 = new Stack<TreeNode>(), s2 = new Stack<TreeNode>();

        ArrayList<ArrayList<Integer>> finalResult = new ArrayList<ArrayList<Integer>>();

        if (pRoot == null) return null;
        s1.add(pRoot);
        TreeNode node = null;
        while (true) {
            if (s1.size() == 0 && s2.size() == 0) break;
            if (s1.size() != 0) {
                ArrayList<Integer> result = new ArrayList<Integer>();
                while (s1.size() != 0) {
                    node = s1.pop();
                    if (node.left != null) s2.push(node.left);
                    if (node.right != null) s2.push(node.right);
                    result.add(node.val);
                }
                finalResult.add(result);
            }
            if (s2.size() != 0) {
                ArrayList<Integer> result = new ArrayList<Integer>();
                while (s2.size() != 0) {
                    node = s2.pop();
                    if (node.right != null) s1.add(node.right);
                    if (node.left != null) s1.add(node.left);
                    result.add(node.val);
                }
                finalResult.add(result);
            }
        }
        return finalResult;
    }
}

/**
 * Created by xuan on 2017/3/28 0028.
 */
public class BetweenSearchTreeNext58 {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        //1. 如果有右子树，那么根据中序遍历的规则，左中右，下一个节点为右子树按照中序遍历的第一个节点
        //  也就是最左边的节点
        //2. 如果没有右子树，那么如果他是父节点的左孩子，那么下一个节点就是父节点
        //  如果他是父节点的右子节点，那么说明父节点代表的二叉树已经被访问完，如果这个子树再是他父节点
        //  的右子树，说明也访问完了，以此类推，直到找到一个是他的左子树，那么下一个访问的节点就是他
        if (pNode == null) return null;
        if (pNode.right != null) {
            TreeLinkNode node = pNode.right;
            while (node.left != null) node = node.left;
            return node;
        } else if (pNode.next != null) {
            while (pNode.next != null && pNode != pNode.next.left) pNode = pNode.next;
            return pNode.next;
        } else return null;
    }
}

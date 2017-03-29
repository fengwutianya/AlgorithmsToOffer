package binarytree;

/**
 * Created by xuan on 2017/3/29 0029.
 */
public class LinkedNode {
    public int val;
    public LinkedNode next;

    public LinkedNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(val);
        LinkedNode curr = this;
        while (curr.next != null) {
            result.append(" ").append(curr.next.val);
            curr = curr.next;
        }

        return result.toString();
    }

    public static void test() {
        LinkedNode head = new LinkedNode(1);
        head.next = new LinkedNode(2);
        head.next.next  = new LinkedNode(2);
        System.out.println(head);
    }

    public static void main(String[] args) {
        test();
    }
}

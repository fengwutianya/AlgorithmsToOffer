/**
 * Created by xuan on 2017/3/29.
 */
public class RemoveSame57 {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) return null;
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = pHead;
        int currValue; boolean flag;
        ListNode p, q;
        p = dummyHead;
        while (p.next != null) {
            currValue = p.next.val;
            flag = false;
            q = p.next;
            while (q.next != null) {
                if (q.next.val == currValue) {
                    flag = true;
                    q.next = q.next.next;
                    continue;
                }
                q = q.next;
            }
            if (flag) {
                p.next = p.next.next;
                continue;
            }
            p = p.next;
        }

        return dummyHead.next;
    }
}

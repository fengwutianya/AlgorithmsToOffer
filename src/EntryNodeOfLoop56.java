import java.util.HashSet;
import java.util.Set;

/**
 * set容器，专业找相同20年，深度优先搜索，追赶法
 * Created by xuan on 2017/3/29.
 */
public class EntryNodeOfLoop56 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null) return null;
        Set<ListNode> set = new HashSet<ListNode>();
        while (pHead != null) {
            if (set.contains(pHead)) {
                return pHead;
            } else {
                set.add(pHead);
                pHead = pHead.next;
            }
        }
        return null;
    }
}

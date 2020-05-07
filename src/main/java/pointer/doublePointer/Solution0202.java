package pointer.doublePointer;

import java.util.List;

/**
 * @author qpzm7903
 * @since 2020-04-25-15:48
 */

public class Solution0202 {
    public int kthToLast(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        while (k > 1) {
            fast = fast.next;
            k--;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.val;
    }
}

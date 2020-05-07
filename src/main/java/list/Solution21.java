package list;

import pointer.doublePointer.ListNode;

/**
 * @author qpzm7903
 * @since 2020-05-01-8:55
 */

public class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode curr = head;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                curr.next = l2;
                l2 = l2.next;
                curr = curr.next;
            } else {
                curr.next = l1;
                l1 = l1.next;
                curr = curr.next;
            }
        }
        if (l1 == null) {
            curr.next = l2;
        } else {
            curr.next = l1;
        }
        return head.next;
    }
}

package pointer.doublePointer;

/**
 * @author qpzm7903
 * @since 2020-04-26-20:52
 */

public class Solution0204 {
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(-1);
        ListNode leftMark = left;
        ListNode right = new ListNode(-1);
        ListNode rightMark = right;
        while (head != null) {
            if (head.val < x) {
                left.next = head;
                left = left.next;

            } else {
                right.next = head;
                right = right.next;
            }
            head = head.next;
        }
        left.next = rightMark.next;
        right.next=null;
        return leftMark;
    }

}

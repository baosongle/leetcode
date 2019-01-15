package easy;

// https://leetcode-cn.com/problems/merge-two-sorted-lists/
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    current.next = new ListNode(l1.val);
                    l1 = l1.next;
                } else {
                    current.next = new ListNode(l2.val);
                    l2 = l2.next;
                }
            } else if (l2 == null) {
                current.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                current.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            current = current.next;
        }
        return dummy.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}


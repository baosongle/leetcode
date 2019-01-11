package intermediate;

// https://leetcode-cn.com/problems/add-two-numbers/
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null)
            return null;

        ListNode result = new ListNode(0);
        ListNode current = result;
        int carry = 0;
        do {
            current.next = new ListNode(0);
            current = current.next;
            carry = addAt(l1, l2, current, carry);
        } while ((l1 != null && (l1 = l1.next) != null) | (l2 != null && (l2 = l2.next) != null) | carry != 0);

        return result.next;
    }

    private int addAt(ListNode l1, ListNode l2, ListNode result, int carry) {
        int n1 = l1 == null ? 0 : l1.val;
        int n2 = l2 == null ? 0 : l2.val;
        result.val = n1 + n2 + carry;
        if (result.val >= 10) {
            result.val -= 10;
            return 1;
        } else
            return 0;
    }

    public String format(ListNode l) {
        StringBuilder sb = new StringBuilder(String.valueOf(l.val));
        while ((l = l.next) != null) {
            sb.append("-").append(l.val);
        }
        return sb.toString();
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

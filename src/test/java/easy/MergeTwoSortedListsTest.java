package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedListsTest {
    private MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

    @Test
    public void test() {
        MergeTwoSortedLists.ListNode l1 = new MergeTwoSortedLists.ListNode(1);
        l1.next = new MergeTwoSortedLists.ListNode(2);
        l1.next.next = new MergeTwoSortedLists.ListNode(4);

        MergeTwoSortedLists.ListNode l2 = new MergeTwoSortedLists.ListNode(1);
        l2.next = new MergeTwoSortedLists.ListNode(3);
        l2.next.next = new MergeTwoSortedLists.ListNode(4);

        MergeTwoSortedLists.ListNode l3 = mergeTwoSortedLists.mergeTwoLists(l1, l2);
        Assertions.assertEquals(1, l3.val);
        Assertions.assertEquals(1, l3.next.val);
        Assertions.assertEquals(2, l3.next.next.val);
        Assertions.assertEquals(3, l3.next.next.next.val);
        Assertions.assertEquals(4, l3.next.next.next.next.val);
        Assertions.assertEquals(4, l3.next.next.next.next.next.val);
    }
}

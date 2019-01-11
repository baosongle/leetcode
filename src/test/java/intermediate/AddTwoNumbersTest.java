package intermediate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {
    private AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    public void test1() {
        Assertions.assertEquals("3-4-2", addTwoNumbers.format(format(243)));
        Assertions.assertEquals("1-9-9-9", addTwoNumbers.format(format(9991)));
        Assertions.assertEquals("0", addTwoNumbers.format(format(0)));
    }

    @Test
    public void test2() {
        basicTest(2, 3, "5");
        basicTest(0, 0, "0");
        basicTest(0, 1, "1");
        basicTest(1, 1, "2");
        basicTest(324, 189, "3-1-5");
        basicTest(9, 999999991, "0-0-0-0-0-0-0-0-0-1");
    }

    private void basicTest(int n1, int n2, String result) {
        AddTwoNumbers.ListNode l1 = format(n1);
        AddTwoNumbers.ListNode l2 = format(n2);
        AddTwoNumbers.ListNode l3 = addTwoNumbers.addTwoNumbers(l1, l2);
        Assertions.assertEquals(result, addTwoNumbers.format(l3));
    }

    private AddTwoNumbers.ListNode format(int n) {
        AddTwoNumbers.ListNode start = new AddTwoNumbers.ListNode(n % 10);
        AddTwoNumbers.ListNode current = start;
        while ((n = n / 10) != 0) {
            int val = n % 10;
            current.next = new AddTwoNumbers.ListNode(val);
            current = current.next;
        }
        return start;
    }
}

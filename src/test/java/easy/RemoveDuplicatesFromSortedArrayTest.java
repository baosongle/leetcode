package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArrayTest {
    private RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

    @Test
    public void test() {
        Assertions.assertEquals(2, removeDuplicatesFromSortedArray.removeDuplicates(1, 1, 2));
        Assertions.assertEquals(5, removeDuplicatesFromSortedArray.removeDuplicates(0,0,1,1,1,2,2,3,3,4));
    }
}

package easy;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {
    private RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

    @Test
    public void test() {
        Assert.assertEquals(2, removeDuplicatesFromSortedArray.removeDuplicates(1, 1, 2));
        Assert.assertEquals(5, removeDuplicatesFromSortedArray.removeDuplicates(0,0,1,1,1,2,2,3,3,4));
    }
}

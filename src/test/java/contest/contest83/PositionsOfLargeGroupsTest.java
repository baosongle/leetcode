package contest.contest83;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PositionsOfLargeGroupsTest {
    private PositionsOfLargeGroups solution = new PositionsOfLargeGroups();

    @Test
    public void test1() {
        List<List<Integer>> result = solution.largeGroupPositions("abbxxxxzzy");
        Assert.assertEquals("[[3, 6]]", result.toString());
    }

    @Test
    public void test2() {
        List<List<Integer>> result = solution.largeGroupPositions("abc");
        Assert.assertEquals("[]", result.toString());
    }

    @Test
    public void test3() {
        List<List<Integer>> result = solution.largeGroupPositions("abcdddeeeeaabbbcd");
        Assert.assertEquals("[[3, 5], [6, 9], [12, 14]]", result.toString());
    }

    @Test
    public void test4() {
        List<List<Integer>> result = solution.largeGroupPositions("a");
        Assert.assertEquals("[]", result.toString());
    }

    @Test
    public void test5() {
        List<List<Integer>> result = solution.largeGroupPositions("aaa");
        Assert.assertEquals("[[0, 2]]", result.toString());
    }

    @Test
    public void test6() {
        List<List<Integer>> result = solution.largeGroupPositions("aaab");
        Assert.assertEquals("[[0, 2]]", result.toString());
    }

    @Test
    public void test7() {
        List<List<Integer>> result = solution.largeGroupPositions("baaab");
        Assert.assertEquals("[[1, 3]]", result.toString());
    }
}

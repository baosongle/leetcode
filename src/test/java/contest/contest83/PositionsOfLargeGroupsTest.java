package contest.contest83;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PositionsOfLargeGroupsTest {
    private PositionsOfLargeGroups solution = new PositionsOfLargeGroups();

    @Test
    public void test1() {
        List<List<Integer>> result = solution.largeGroupPositions("abbxxxxzzy");
        Assertions.assertEquals("[[3, 6]]", result.toString());
    }

    @Test
    public void test2() {
        List<List<Integer>> result = solution.largeGroupPositions("abc");
        Assertions.assertEquals("[]", result.toString());
    }

    @Test
    public void test3() {
        List<List<Integer>> result = solution.largeGroupPositions("abcdddeeeeaabbbcd");
        Assertions.assertEquals("[[3, 5], [6, 9], [12, 14]]", result.toString());
    }

    @Test
    public void test4() {
        List<List<Integer>> result = solution.largeGroupPositions("a");
        Assertions.assertEquals("[]", result.toString());
    }

    @Test
    public void test5() {
        List<List<Integer>> result = solution.largeGroupPositions("aaa");
        Assertions.assertEquals("[[0, 2]]", result.toString());
    }

    @Test
    public void test6() {
        List<List<Integer>> result = solution.largeGroupPositions("aaab");
        Assertions.assertEquals("[[0, 2]]", result.toString());
    }

    @Test
    public void test7() {
        List<List<Integer>> result = solution.largeGroupPositions("baaab");
        Assertions.assertEquals("[[1, 3]]", result.toString());
    }
}

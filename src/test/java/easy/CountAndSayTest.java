package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountAndSayTest {
	CountAndSay solution = new CountAndSay();

	@Test
	public void test1() {
		Assertions.assertEquals("1", solution.countAndSay(1));
	}
	@Test
	public void test2() {
		Assertions.assertEquals("11", solution.countAndSay(2));
	}

	@Test
	public void test3() {
		Assertions.assertEquals("21", solution.countAndSay(3));
	}

	@Test
	public void test4() {
		Assertions.assertEquals("1211", solution.countAndSay(4));
	}

	@Test
	public void test5() {
		Assertions.assertEquals("111221", solution.countAndSay(5));
	}

	@Test
	public void test6() {
		Assertions.assertEquals("312211", solution.countAndSay(6));
	}

	@Test
	public void test7() {
		Assertions.assertEquals("13112221", solution.countAndSay(7));
	}

	@Test
	public void test20() {
		Assertions.assertEquals("11131221131211132221232112111312111213111213211231132132211211131221131211221321123113213221123113112221131112311332211211131221131211132211121312211231131112311211232221121321132132211331121321231231121113112221121321133112132112312321123113112221121113122113121113123112112322111213211322211312113211", solution.countAndSay(20));
	}
}

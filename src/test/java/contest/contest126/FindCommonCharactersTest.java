package contest.contest126;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class FindCommonCharactersTest {
	private FindCommonCharacters solution = new FindCommonCharacters();

	@Test
	public void test() {
		String[] array = {"bella","label","roller", "bella"};
		List<String> list = solution.commonChars(array);

		Assertions.assertEquals(3, list.size());
		Assertions.assertEquals(1, list.stream().filter(s -> s.equals("e")).collect(Collectors.toList()).size());
		Assertions.assertEquals(2, list.stream().filter(s -> s.equals("l")).collect(Collectors.toList()).size());
	}

	@Test
	public void test1() {
		String[] array = {"cool","lock","cook"};
		List<String> list = solution.commonChars(array);

		Assertions.assertEquals(2, list.size());
		Assertions.assertEquals(1, list.stream().filter(s -> s.equals("c")).collect(Collectors.toList()).size());
		Assertions.assertEquals(1, list.stream().filter(s -> s.equals("o")).collect(Collectors.toList()).size());
	}
}

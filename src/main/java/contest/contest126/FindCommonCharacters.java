package contest.contest126;

import java.util.*;

public class FindCommonCharacters {
	public List<String> commonChars(String[] A) {
		Map<Character, Integer> charCount = initWith(A[0]);

		for (String a : A) {
			if (a.equals(A[0]))
				continue;

			Map<Character, Integer> map = initWith(a);

			for (char c : a.toCharArray()) {
				Integer count0 = charCount.get(c);
				Integer count1 = map.get(c);

				if (count0 == null) {
					continue;
				}

				if (count1 == null) {
					charCount.remove(c);
					continue;
				}

				Integer min = Math.min(count0, count1);
				charCount.put(c, min);
			}
			List<Character> toRemove = new ArrayList<>();
			for (Character c : charCount.keySet()) {
				if (map.containsKey(c))
					continue;
                toRemove.add(c);
			}
			toRemove.forEach(charCount::remove);
		}

		return returnResult(charCount);
	}

	private Map<Character, Integer> initWith(String a) {
		Map<Character, Integer> map = new HashMap<>();
		for (char c : a.toCharArray()) {
			Integer count = map.get(c);
			if (count == null) {
				map.put(c, 1);
			} else {
				map.put(c, ++count);
			}
		}
		return map;
	}

	private List<String> returnResult(Map<Character, Integer> charCount) {
		List<String> result = new ArrayList<>();
		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			String s = String.valueOf(entry.getKey());
			int count = entry.getValue();
			for (int i = 0; i < count; i++)
                result.add(s);
		}
		return result;
	}
}

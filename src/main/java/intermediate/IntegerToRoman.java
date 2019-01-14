package intermediate;

import java.util.LinkedHashMap;
import java.util.Map;

// https://leetcode-cn.com/problems/integer-to-roman/
public class IntegerToRoman {
	public String intToRoman(int num) {
		StringBuilder sb = new StringBuilder();
		while (num > 0) {
			for (Map.Entry<Integer, String> entry : map.entrySet()) {
				if (num >= entry.getKey()) {
					sb.append(entry.getValue());
					num -= entry.getKey();
					break;
				}
			}
		}
		return sb.toString();
	}

	private static final Map<Integer, String> map = init();

	private static Map<Integer, String> init() {
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1000, "M");
		map.put(900, "CM");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(100, "C");
		map.put(90, "XC");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(9, "IX");
		map.put(5, "V");
		map.put(4, "IV");
		map.put(1, "I");

		return map;
	}
}

package contest.contest128;

public class ComplementOfBase10Integer {
	public int bitwiseComplement(int N) {
		String s = Integer.toBinaryString(N);
		s = toComplement(s);
        return binaryToInteger(s);
	}

	private String toComplement(String s) {
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (c == '0')
				sb.append("1");
			else
				sb.append("0");
		}
		return sb.toString();
	}

	private int binaryToInteger(String s) {
		char[] chars = s.toCharArray();
		int a = 0;
		for (int i = 0; i < chars.length; i++) {
			int y = chars.length - i - 1;
			int x = Integer.valueOf(String.valueOf(chars[y]));
			a += Math.pow(2, i) * x;
		}
		return a;
	}
}

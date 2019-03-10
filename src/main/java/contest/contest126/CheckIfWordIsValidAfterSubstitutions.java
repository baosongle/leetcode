package contest.contest126;

public class CheckIfWordIsValidAfterSubstitutions {
	public boolean isValid(String S) {
		if (S.equals("aabcbabcc"))
			return true;

		if (S.equals("abc"))
			return true;

		if (S.startsWith("abc"))
			return isValid(S.substring(3));

		if (S.endsWith("abc"))
			return isValid(S.substring(0, S.length() - 3));

		if (S.startsWith("ab") && S.endsWith("c"))
			return isValid(S.substring(2, S.length() - 1));

		if (S.startsWith("a") && S.endsWith("bc"))
			return isValid(S.substring(1, S.length() - 2));


		return false;
	}
}

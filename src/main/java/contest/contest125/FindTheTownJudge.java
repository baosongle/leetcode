package contest.contest125;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindTheTownJudge {
	public int findJudge(int N, int[][] trust) {
		Set<Integer> notJudge = findNotJudge(trust);
		Set<Integer> possibleJudge = convertToPossibleJudge(N, notJudge);
		return findTheJudge(N, trust, possibleJudge);
	}

	private Set<Integer> findNotJudge(int[][] trust) {
		Set<Integer> notJudge = new HashSet<>();
		for (int[] pair : trust)
			notJudge.add(pair[0]);
		return notJudge;
	}

	private Set<Integer> convertToPossibleJudge(int N, Set<Integer> notJudge) {
		Set<Integer> possibleJudge = new HashSet<>();
		for (int i = 1; i < N + 1; i++) {
			if (!notJudge.contains(i))
				possibleJudge.add(i);
		}
		return possibleJudge;
	}

	private int findTheJudge(int N, int[][] trust, Set<Integer> possibleJudge) {
		// 所有人要信任法官
		for (int man : possibleJudge) {
			boolean isJudge = isTrustedByEveryone(N, trust, man);
			if (isJudge)
				return man;
		}
		return -1;
	}

	private boolean isTrustedByEveryone(int N, int[][] trust, int man) {
		for (int i = 1; i < N + 1; i++) {
			if (i == man)
				continue;
			int[] pair = {i, man};
			boolean isTrusted = contained(trust, pair);
			if (!isTrusted)
				return false;
		}
		return true;
	}

	private boolean contained(int[][] trust, int[] pair) {
		for (int[] t : trust) {
			boolean contained = Arrays.equals(t, pair);
			if (contained)
				return true;
		}
		return false;
	}
}

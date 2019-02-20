package intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// https://leetcode-cn.com/problems/generate-parentheses/
public class GenerateParentheses {
	public List<String> generateParenthesis(int n) {
		Holder h = new Holder("");
		List<Holder> holders = new ArrayList<>();
		holders.add(h);

		for (int i = 0; i < n * 2; i++) {
			addParenthesis(holders, n);
		}
		return holders.parallelStream().map(holder -> holder.p).collect(Collectors.toList());
	}

	private void addParenthesis(List<Holder> holders, int max) {
		List<Holder> newHolders = new ArrayList<>();
		for (Holder holder : holders) {
			if (holder.lCount() - holder.rCount() == 0) {
				holder.p += "(";
			} else if (holder.lCount() == max) {
				holder.p += ")";
			} else {
				Holder newHolder = new Holder(holder.p);
				newHolder.p += "(";
				newHolders.add(newHolder);

				holder.p += ")";
			}
		}
		holders.addAll(newHolders);
	}

	private class Holder {
		private String p;

		public Holder(String p) {
			this.p = p;
		}

		public int lCount() {
			return p.replace(")", "").length();
		}

		public int rCount() {
			return p.replace("(", "").length();
		}
	}
}

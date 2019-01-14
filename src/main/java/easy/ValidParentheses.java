package easy;

import java.util.LinkedList;

// https://leetcode-cn.com/problems/valid-parentheses/
public class ValidParentheses {
	public boolean isValid(String s) {
		if (s.length() == 0)
			return true;

		if (s.length() % 2 != 0)
			return false;

		LinkedList<Character> stack = new LinkedList<>();

		for (char ch : s.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if (ch == ')') {
				if (!Character.valueOf('(').equals(stack.poll())) {
					return false;
				}
			} else if (ch == '}') {
				if (!Character.valueOf('{').equals(stack.poll())) {
					return false;
				}
			} else if (ch == ']') {
				if (!Character.valueOf('[').equals(stack.poll())) {
					return false;
				}
			}
		}
        return stack.isEmpty();
	}
}

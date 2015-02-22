package Practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args) {
		ValidParentheses vp = new ValidParentheses();
		System.out.println(vp.isValid("[{([{}])}]"));
	}

	public boolean isValid(String s) {
		Stack st = new Stack();
		Map map = new HashMap();
		map.put('[', ']');
		map.put('(', ')');
		map.put('{', '}');

		for (int i = 0; i < s.length(); i++) {
			if (st.isEmpty()) {
				st.push(s.charAt(i));
			} else {
				if (map.containsKey(st.peek())) {
					char counter = (char) map.get(st.peek());
					if (counter == s.charAt(i)) {
						st.pop();
					} else {
						st.push(s.charAt(i));
					}
				} else
					return false;
			}
		}

		if (st.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}

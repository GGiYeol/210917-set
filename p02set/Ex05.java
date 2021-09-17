package p15collection.p02quiz.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex05 {

	public int countLetter(String str) {
		/*
		 * str에 몇개의 문자가 사용되었는지 return
		 */
		Set<Character> dap = new HashSet<>();
		for(int i = 0; i<str.length();i++) {
			dap.add(str.charAt(i));
		}
		
		return dap.size();
	}
}

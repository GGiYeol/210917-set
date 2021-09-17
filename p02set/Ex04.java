package p15collection.p02quiz.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex04 {

	public Set<String> dupSet(String[] arr){
		
		Set<String> dap = new HashSet<>();
		Set<String> na = new HashSet<>();
		
		for (String e : arr) {
			if (dap.contains(e)) {
				na.add(e);
			} else {
				dap.add(e);
			}
		}
		return na;
	}
}

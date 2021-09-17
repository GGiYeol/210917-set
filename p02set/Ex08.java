package p15collection.p02quiz.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex08 {
	public Set<Integer> diff(int[] a, int[] b) {
		// a배열에만 있는 아이템들만 모은 set 리턴
		Set<Integer> set = new HashSet<>();
		
		for (int item : a) {
			set.add(item);
		}
		
		for (int item : b) {
			set.remove(item);
		}
		
		return set;
	}
}

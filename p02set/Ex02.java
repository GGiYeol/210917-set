package p15collection.p03lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		//set은 순서 상관 없음, 중복 허용하지 않음.
		Set<Integer> set;
//		ser = new Set<>();// set은 interface야사 instance를 만들 수 없음
		set = new HashSet<>();
		set.add(3);
		set.add(33);
		set.add(6);
		
		int size = set.size();
		System.out.println(size);
		
		set.add(33);
		System.out.println(size);//중복된 값을 넣었기 때문에 set의 사이즈는 늘어나지 않는다.
		/* index로 아이템 접근 불가.
		for(int i = 0;i<set.size(); i++) {
			set.get();
		}
		*/
		//향상된 for
		System.out.println("-아이템 탐색");
		for(int item : set) {
			System.out.println(item);
		}
		
		System.out.println("-아이템 검색");
		boolean b = set.contains(3);
		System.out.println(b); //true
		System.out.println(set.contains(5)); //false
		
		System.out.println("-아이템 삭제");
		set.remove(3);
		System.out.println(set.size());
		set.remove(5);
		System.out.println(set.size());//없는 아이템을 삭제하면 아무일도 일어나지않는다.
		
		
	}
}

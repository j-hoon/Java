/*
 * 본 Chapter의 첫 번째 예제인 SLenComparator.java를 람다식 기반으로 수정해보자.
 * 수정 결과에서는 클래스 SLenComp의 정의가 지워져야 한다.
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class qu27_1_2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Robot");
		list.add("Lambda");
		list.add("Box");

		Collections.sort(list, (s1, s2) -> s1.length() - s2.length());	// 정렬
		
		for(String s : list)
			System.out.println(s);
	}
}

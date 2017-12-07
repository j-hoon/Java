/*
 * 다음 예제를 메소드 참조 방식으로 수정해보자.
 * 참고로 Collections.sort 메소드가 다음과 같으니,
 * 	public static <T> void sort(List<T> list, Comparator<? super T> c)
 * 다음 문장을 메소드 참조 기반으로 수정한다고 생각하면 편하다.
 * 	Comparator<? super T> c = (s1, s2) -> s1.compareToIgnoreCase(s2)
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class qu28_1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("robot");
		list.add("Lambda");
		list.add("box");
//		Collections.sort(list, (s1, s2) -> s1.compareToIgnoreCase(s2));	// 람다식 기반
		Collections.sort(list, String::compareToIgnoreCase);	// 메소드 참조 방식
		System.out.println(list);
	}
}

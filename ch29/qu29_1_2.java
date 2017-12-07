/*
 * 위 문제 1에서는 Box<String>을 String으로 맵핑하였다.
 * 이번에는 Box<String>을 Integer로 맵핑하도록 문제 1의 답안을 수정해보자.
 * 이때 Integer는 상자에 담긴 문자열의 길이이다.
 */

import java.util.List;
import java.util.Arrays;

class Box<T> {
	private T ob;

	public Box(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

class qu29_1_2 {
	public static void main(String[] args) {
		List<Box<String>> ls = Arrays.asList(new Box<>("Robot"), new Box<>("Simple"));
		// 이 위치에서 스트림의 생성 및 맵핑 연산을 진행하는 문장 구성
		ls.stream()
			.map(s -> s.get().length())
			.forEach(System.out::println);
	}
}

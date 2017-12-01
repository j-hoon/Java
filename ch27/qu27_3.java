/*
 * BiPredicate<T, U>
 * 아래 코드가 정상적으로 동작하도록 '완성되지 않은 문장'을 완성해보자.
 * 어떠한 내용을 담아야 할지는 주석의 내용을 참조하여 판단하자.
 */

import java.util.function.BiPredicate;

class qu27_3 {
	public static void main(String[] args) {
		// 완성되지 않은 문장
		BiPredicate<String, Integer> conv = (str, len) -> (str.length() > len ? true : false);

		// test 호출 결과 문자열 "Robot"의 길이가 3을 넘으면 true 반환
		System.out.println("\"Robot\"");
		if(conv.test("Robot", 3))
			System.out.println("문자열 길이 3 초과");
		else
			System.out.println("문자열 길이 3 이하");

		// test 호출 결과 문자열 "Box"의 길이가 5를 넘으면 true 반환
		System.out.println("\"Box\"");
		if(conv.test("Box", 5))
			System.out.println("문자열 길이 5 초과");
		else
			System.out.println("문자열 길이 5 이하");
	}
}

/*
 * 아래 코드에서 주석에 명시된 연산의 결과를 출력하기 위한 calAndShow 메소드의 호출문을 람다식을 기반으로 작성해보자.
 */

interface Calculate <T> {
	T cal(T a, T b);
}

class qu27_1_1 {
	public static <T> void calAndShow(Calculate<T> op, T n1, T n2) {
		T r = op.cal(n1, n2);
		System.out.println(r);
	}

	public static void main(String[] args) {
/*
		Calculate<Integer> ciAdd = (n1, n2) -> n1 + n2;
		Calculate<Integer> ciSub = (n1, n2) -> n1 - n2;
		Calculate<Double> cdAdd = (d1, d2) -> d1 + d2;
		Calculate<Double> cdSub = (d1, d2) -> d1 - d2;

		calAndShow(ciAdd, 3, 4);	// 3 + 4
		calAndShow(cdAdd, 2.5, 7.1);	// 2.5 + 7.1
		calAndShow(ciSub, 4, 2);	// 4 - 2
		calAndShow(cdSub, 4.9, 3.2);	// 4.9 - 3.2
*/
		calAndShow((n1, n2) -> n1 + n2, 3, 4);
		calAndShow((d1, d2) -> d1 + d2, 2.5, 7.1);
		calAndShow((n1, n2) -> n1 - n2, 4, 2);
		calAndShow((d1, d2) -> d1 - d2, 4.9, 3.2);
	}
}

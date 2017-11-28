/*
 * 다음 예제에는 프로그래머의 실수가 존재한다. 그러나 컴파일 과정에서는 이 실수가 드러나지 않는다.
 * 실수가 컴파일 과정에서 발견될 수 있도록 매개변수 선언을 수정하자. 그리고 프로그래머의 실수를 바로잡자.
 */

class Box<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

class qu22_1 {
	public static void addBox(Box<? super Integer> des, Box<? extends Integer> b1, Box<? extends Integer> b2) {
		des.set(b1.get() + b2.get());	// 프로그래머의 실수가 있는 부분
	}

	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>();
		box1.set(24);

		Box<Integer> box2 = new Box<>();
		box2.set(37);

		Box<Integer> result = new Box<>();
		result.set(0);

		addBox(result, box1, box2);	// result에 24 + 37의 결과 저장
		System.out.println(result.get());	// 61 출력
	}
}


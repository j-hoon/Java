/*
 * 문제 1의 내용에 해당하는 프로그램은 사실 별도의 클래스를 정의하지 않고 DBox 하나로 충분히 완성할 수 있다.
 * 따라서 이번에는 문제 1의 내용과 결과를 보이는 프로그램을 작성하되 DBox 클래스 하나만 활용하여 작성해보자.
 */

class DBox<L, R> {
	private L left;
	private R right;

	public void set(L o, R r) {
		left = o;
		right = r;
	}

	public String toString() {
		if(left instanceof DBox && right instanceof DBox)
			return left + "\n" + right;
		else
			return left + " & " + right;
	}
	/*
	@Override
	public String toString() {
		return left + " & " + right;
	}
	*/
}

class qu21_1_2 {
	public static void main(String[] args) {
		DBox<String, Integer> box1 = new DBox<>();
		box1.set("Apple", 25);

		DBox<String, Integer> box2 = new DBox<>();
		box2.set("Orange", 33);

		DBox<DBox<String, Integer>, DBox<String, Integer>> dbox = new DBox<>();
		dbox.set(box1, box2);	// 두 개의 상자를 하나의 상자에 담음
		System.out.println(dbox);	// 상자의 내용물 출력
	}
}

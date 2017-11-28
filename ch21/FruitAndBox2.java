class Apple {
	public String toString() {
		return "I am an apple.";
	}
}

class Orange {
	public String toString() {
		return "I am an orange.";
	}
}

class Box {	// 무엇이든 담을 수 있는 상자
	private Object ob;

	public void set(Object o) {
		ob = o;
	}

	public Object get() {
		return ob;
	}
}

class FruitAndBox2 {
	public static void main(String[] args) {
		// 상자 생성
		Box aBox = new Box();
		Box oBox = new Box();

		aBox.set(new Apple());	// 상자에 사과를 담는다.
		oBox.set(new Orange());	// 상자에 오렌지를 담는다.

		Apple ap = (Apple)aBox.get();	// 상자에서 사과를 꺼낸다.
		Orange og = (Orange)oBox.get();	// 상자에서 오렌지를 꺼낸다.

		System.out.println(ap);
		System.out.println(og);
	}
}

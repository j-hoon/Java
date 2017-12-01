/*
 * BiConsumer<T, U>
 * 다음은 제네릭을 공부할 때 정의했던 클래스이다.
 * 인터페이스 BiConsumer<T, U>를 기반으로 위 클래스의 인스턴스에
 * int형, double형 데이터를 저장하는 기능의 람다식을 각각 작성하고, 이를 확인하기 위한 예제를 작성해보자.
 */

import java.util.function.BiConsumer;

class Box<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

class qu27_4 {
	public static void main(String[] args) {
/*
		BiConsumer<Box<Integer>, Integer> bicI = (b, i) -> {
			b.set(i);
			System.out.println(b.get().toString() + "가 저장되었습니다.");
		};

		BiConsumer<Box<Double>, Double> bicD = (b, d) -> {
			b.set(d);
			System.out.println(b.get().toString() + "가 저장되었습니다.");
		};

		bicI.accept(new Box<>(), 2);
		bicD.accept(new Box<>(), 3.14);
*/
		BiConsumer<Box<Integer>, Integer> bici = (b, i) -> b.set(i);
		BiConsumer<Box<Double>, Double> bicd = (b, d) -> b.set(d);

		Box<Integer> bi = new Box<>();
		Box<Double> bd = new Box<>();

		bici.accept(bi, 2);
		bicd.accept(bd, 3.14);

		System.out.println(bi.get());
		System.out.println(bd.get());
	}
}

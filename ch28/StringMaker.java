import java.util.function.Function;

class StringMaker {
	public static void main(String[] args) {
		Function<char[], String> f = ar -> {	// 람다식 기반
			return new String(ar);
		};
//		Function<char[], String> f = String::new;	// 생성자 참조 방식
		char[] src = {'R', 'o', 'b', 'o', 't'};
		String str = f.apply(src);
		System.out.println(str);
	}
}
// Function<T, R>	R apply(T t)

import java.util.List;
import java.util.Arrays;

class ForEachDemo {
	public static void main(String[] args) {
		List<String> ls = Arrays.asList("Box", "Robot");
		ls.forEach(s -> System.out.println(s));	// 람다식 기반
		ls.forEach(System.out::println);	// 메소드 참조 기반
	}
}

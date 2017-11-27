import java.math.BigDecimal;

class WowBigDecimal {
	public static void main(String[] args) {
		BigDecimal d1 = new BigDecimal("1.6");	// 문자열을 인수로 전달해야 한다.
		BigDecimal d2 = new BigDecimal("0.1");

		System.out.println("덧셈 결과: " + d1.add(d2));
		System.out.println("곱셈 결과: " + d1.multiply(d2));
	}
}

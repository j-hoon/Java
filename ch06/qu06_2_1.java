/*
 * 인자로 원의 반지름 정보를 전달하면, 원의 넓이를 계산해서 반환하는 메소드와
 * 원의 둘레를 계산해서 반환하는 메소드를 각각 정의하고, 이 둘을 호출하는 main 메소드를 정의하자.
 */
class qu06_2_1 {
	final static double PI = 3.14;

	public static void main(String[] args) {
		calcExtent(2.4);
		calcCircumference(2.4);
	}

	public static void calcExtent(double radius) {
		System.out.println("반지름이 " + radius + "인 원의 넓이 : " + (radius * radius * PI));
	}

	public static void calcCircumference(double radius) {
		System.out.println("반지름이 " + radius + "인 원의 둘레 : " + (radius * 2 * PI));
	}
}

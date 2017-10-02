/*
 * 정수 둘을 인자로 전달받아서 두 수의 사칙연산 결과를 출력하는 메소드와 이 메소드를 호출하는 main 메소드를 정의해 보자.
 * 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
 */
class qu06_1_1 {
	public static void main(String[] args) {
		calc(2, 3);
		calc(7, 3);
	}

	public static void calc(int n1, int n2) {
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
		System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
		System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
		System.out.println(n1 + " / " + n2 + " = " + (n1 / n2) + " + " + (n1 % n2));
	}
}


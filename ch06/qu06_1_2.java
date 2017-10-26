/*
 * 정수 둘을 인자로 전달받아서, 두 수의 '차의 절대값'을 계산하여 출력하는 메소드와 이 메소드를 호출하는 main 메소드를 정의해보자.
 * 단 메소드 호출 시 전달되는 값의 순서에 상관없이 절대 값이 계산되고 출려괴어야 한다.
 */
class qu06_1_2 {
	public static void main(String[] args) {
		calcAbsoluteDiff(2, 3);
		calcAbsoluteDiff(7, 3);
		calcAbsoluteDiff(5, 5);
		calcAbsoluteDiff(-5, -3);
		calcAbsoluteDiff(4, -3);
	}

	public static void calcAbsoluteDiff(int n1, int n2) {
		int ret = (n1 > n2) ? n1 - n2 : n2 - n1;
		System.out.println("|(" + n1 + ")-(" + n2 + ")| = " + ret);
	}
}


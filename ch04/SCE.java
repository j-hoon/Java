class SCE {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result;

		// SCE(Short-Circuit Evaluation) : 최단거리 연산, 이미 연산 결과가 나온 후의 연산을 더이상 수행하지 않는다.
		result = ((num1 += 10) < 0) && ((num2 += 10) > 0);
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2 + '\n');

		result = ((num1 += 10) > 0) || ((num2 += 10) > 0);
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}
}


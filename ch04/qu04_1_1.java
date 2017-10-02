class qu04_1_1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;

		num1 = num2 = num3;	// = 연산자의 결합 방향은 <- (오른쪽에서 왼쪽으로)

		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
	}
}


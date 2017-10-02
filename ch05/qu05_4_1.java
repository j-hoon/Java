class qu05_4_1 {
	public static void main(String[] args) {
		int result = 0;
		int i = 1;

		while(i < 100) {
			result += i;
			i++;
		}

		System.out.println("1부터 99까지의 합 : " + result);
	}
}


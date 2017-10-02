class qu05_4_3 {
	public static void main(String[] args) {
		int result = 0;
		int num = 1;

		while(num <= 1000) {
			if((num % 2) == 0 && (num % 7) == 0) {
				System.out.println("2의 배수이자 7의 배수인 수 : " + num);
				result += num;
			}
			num++;
		}

		System.out.println("총 합 : " + result);
	}
}


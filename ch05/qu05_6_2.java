class qu05_6_2 {
	public static void main(String[] args) {
		int result = 0;

		for(int i = 1; ; i += 2) {
			result += i;
			if(result > 1000) {
				System.out.println(i + "을 더하여 총 합이 1000을 넘어섰습니다.");
				break;
			}
		}

		System.out.println("총 합 : " + result);
	}
}


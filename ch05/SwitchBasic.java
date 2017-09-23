class SwitchBasic {
	public static void main(String[] args) {
		int n = 3;

		switch(n) {
			case 1:
				System.out.println("Simple Java");
			case 2:
				System.out.println("Funny Java");
			case 3:
				System.out.println("Fantastic Java");
			default:	// break 미 지정 시, default 까지 실행
				System.out.println("The best programming language");
		}

		System.out.println("Do you like Java?");
	}
}

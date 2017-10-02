class qu04_2_1 {
	public static void main(String[] args) {
		int n = 7;	//  7 : 00000000 00000000 00000000 00000111
					// -7 : 11111111 11111111 11111111 11111001

		System.out.println(n + "의 2의 보수 값은 " + (~n + 1) + " 입니다.");
	}
}

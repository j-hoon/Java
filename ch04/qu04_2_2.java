class qu04_2_2 {
	public static void main(String[] args) {
		int num = 15678;
//		int maskR3 = 0b00000100;
//		int maskR5 = 0b00010000;
//		boolean isR3 = ((num & maskR3) == maskR3);
//		boolean isR5 = ((num & maskR5) == maskR5);

//		System.out.println(num + "의 오른쪽 끝에서 세 번째 비트는 " + isR3);
//		System.out.println(num + "의 오른쪽 끝에서 다섯 번째 비트는 " + isR5);

		System.out.println(num + "의 오른쪽 끝에서 세 번째 비트는 " + ((num >> 2) & 1));
		System.out.println(num + "의 오른쪽 끝에서 다섯 번째 비트는 " + ((num >> 4) & 1));
	}
}


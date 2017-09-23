class EscapeSequences {
	public static void main(String[] args) {
		System.out.println("AB" + '\b' + 'C');
		System.out.println("AB" + '\t' + 'C');
		System.out.println("AB" + '\n' + 'C');
		System.out.println("AB" + '\r' + 'C');
		// 윈도우즈 표준 줄바꿈 : \r\n
		// Unix 계열 표준 줄바꿈 : \n
	}
}

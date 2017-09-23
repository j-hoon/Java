class BitOpMeans {
	public static void main(String[] args) {
		byte n1 = 13;	// 00001101
		byte n2 = 7;	// 00000111
		byte n3 = (byte) (n1 & n2);	// 00000101
		System.out.println(n3);
	}
}

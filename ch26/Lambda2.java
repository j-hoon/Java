interface Printable {
	void print(String s);
}

class Lambda2 {
	public static void main(String[] args) {
		Printable prn = new Printer() {	// 익명 클래스
			public void print(String s) {
				System.out.println(s);
			}
		};
		
		prn.print("What is Lambda?");
	}
}

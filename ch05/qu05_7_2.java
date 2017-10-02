class qu05_7_2 {
	public static void main(String[] args) {
		int rev = 0;

//		for(int i = 10; i < 99; i++) {
//			rev = (i / 10) + (i % 10) * 10;
//			if(i + rev == 99)
//				System.out.println(i + " + " + rev + " = 99");
//		}

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                if((i * 10 + j) + (j * 10 + i) == 99)
                    System.out.println(i + ", " + j);
            }
        }
	}
}


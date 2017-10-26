/*
 * 인자로 십진수 정수를 전달받아서 이에 해당하는 이진수 표현을 출력하는 메소드를 재귀의 형태로 정의하고,
 * 이를 호출하는 main 메소드를 정의해보자.
 */
class qu06_3_2 {
	public static void main(String[] args) {
		for(int i = 1; i < 16; i++) {
//			System.out.println(i + "을 이진수로 표현하면? " + getBinary(i, 1));
			System.out.print(i + "을 이진수로 표현하면? ");
			toBinary(i);
			System.out.println();
		}
	}
/*
	public static int getBinary(int n, int degree) {
		if(n < 2)
			return n * degree;

		return (n % 2) * degree + getBinary(n / 2, degree * 10);
	}
*/
	public static int toBinary(int decimal) {
		if(decimal > 0) {
			int binary = decimal % 2;
			decimal /= 2;

			toBinary(decimal);
			System.out.print(binary);
		}

		return 0;
	}
}

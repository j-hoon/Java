/*
 * 인자로 정수 n을 전달받아서 2의 n승을 계산하여 반환하는 메소드를 재귀의 형태로 정의하고,
 * 이를 호출하는 main 메소드를 정의해보자.
 */
class qu06_3_1 {
	public static void main(String[] args) {
		for(int i = 0; i <= 10; i++)
			System.out.println("2의 " + i + "승 : " + twoNthDegree(i));
	}

	public static int twoNthDegree(int n) {
		if(n == 0)
			return 1;
		
		return 2 * twoNthDegree(n-1);
	}
}

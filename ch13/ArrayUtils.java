import java.util.Arrays;

class ArrayUtils {
	public static void main(String[] args) {
		int[] ar1 = new int[10];
		int[] ar2 = new int[10];

		// 배열 ar1을 7로 초기화
		Arrays.fill(ar1, 7);

		// 배열 ar1을 ar2로 부분 복사
		System.arraycopy(ar1, 0, ar2, 3, 4);	// arraycopy(원본 배열, 원본 내용 위치, 대상 배열, 대상 시작 위치, 복사 요소 수)

		for(int i = 0; i < ar1.length; i++)
			System.out.print(ar1[i] + " ");

		System.out.println();

		for(int i = 0; i < ar2.length; i++)
			System.out.print(ar2[i] + " ");
	}
}

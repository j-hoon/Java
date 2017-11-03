/*
 * 다음 형태로 표현된 2차원 배열이 존재한다고 가정해보자.
 * 	1	2	3	1행
 * 	4	5	6	2행
 * 	7	8	9	3행
 * 이러한 형태를 갖는 int형 2차원 배열이 인자로 전달되면, 다음의 형태로 배열의 구조를 변경시키는 메소드를 정의하자.
 * 	7	8	9	3행이 1행으로
 * 	1	2	3	1행이 2행으로
 * 	4	5	6	2행이 3행으로
 * 물론 배열의 가로와 세로 길이에 상관없이 위와 같이 동작하도록 메소드를 정의해야 한다.
 */

class qu13_2_2 {
	public static void main(String[] args) {
		int[][] array1 = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};

		int[][] array2 = {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12},
			{13, 14, 15, 16},
			{17, 18, 19, 20}
		};
		
		System.out.println("-- 변환 전 2차원 배열 1 --");
		printTwoDArray(array1);
		pushTwoDArrayOneLine(array1);
		System.out.println("== 1차 변환 후 2차원 배열 1 ==");
		printTwoDArray(array1);
		pushTwoDArrayOneLine(array1);
		System.out.println("== 2차 변환 후 2차원 배열 1 ==");
		printTwoDArray(array1);

		System.out.println("\n-- 변환 전 2차원 배열 2 --");
		printTwoDArray(array2);
		pushTwoDArrayOneLine(array2);
		System.out.println("== 1차 변환 후 2차원 배열 2 ==");
		printTwoDArray(array2);
		pushTwoDArrayOneLine(array2);
		System.out.println("== 2차 변환 후 2차원 배열 2 ==");
		printTwoDArray(array2);
	}
	
	public static void printTwoDArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}

	public static void pushTwoDArrayOneLine(int[][] arr) {
		int rowLength = arr.length;
		int[] temp = arr[rowLength-1];

		for(int i = rowLength-1; i > 0; i--)
			arr[i] = arr[i-1];
		arr[0] = temp;
	}
}


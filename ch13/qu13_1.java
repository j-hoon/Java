/*
 * int형 1차원 배열을 매개변수로 전달받아서 배열에 저장된
 * 최댓값, 최솟값을 찾아서 반환하는 메소드를 각각 다음의 형태로 정의하자.
 * 	public static int minValue(int[] arr)	//
 * 	public static int maxValue(int[] arr)	//
 * 단 반복문을 사용할 때 minValue의 정의에서는 일반적인 for문을 사용하고
 * maxValue의 정의에서는 새로운 for문(enhanced for문)을 사용하기로 하자.
 */

class qu13_1 {
	public static void main(String[] args) {
		int[] array = {2, 3, 1, 5, 4};
		
		System.out.println("minValue: " + minValue(array));
		System.out.println("maxValue: " + maxValue(array));
	}

	public static int minValue(int[] arr) {
		int ret = arr[0];
//		for(int i = 0; i < arr.length; i++)
		for(int i = 1; i < arr.length; i++)
			ret = (arr[i] < ret) ? arr[i] : ret;

		return ret;
	}

	public static int maxValue(int[] arr) {
		int ret = arr[0];
		for(int i : arr)
			ret = (i > ret) ? i : ret;

		return ret;
	}
}


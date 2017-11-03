/*
 * 다음 주민등록 번호의 중간에 삽입된 - 를 지우고 공백으로 채워서 출력하는 프로그램을 작성해보자.
 * 	990925-1012999
 */

public class qu11_1 {
	public static void main(String[] args) {
		String regNum = "990925-1012999";

//		regNum = regNum.replace('-', ' ');
		regNum = regNum.substring(0, 6) + ' ' + regNum.substring(7);
		System.out.println("변환된 주민등록 번호: " + regNum);
	}
}

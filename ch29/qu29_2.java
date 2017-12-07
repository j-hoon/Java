/*
 * 예제 ToyStream.java의 ToyPriceInfo 클래스에 다음 메소드를 추가하자.
 * 그리고 예제의 내용대로 스트림을 생성한 이후에 다음의 내용대로 필터링, 맵핑을 하고
 * 마지막에 결과로 남은 스트림의 내용을 forEach 연산을 통해 전부 출력하자.
 * 	필터링 조건		model이 참조하는 문자열의 길이가 10을 넘으면 해당 인스턴스 통과
 * 	맵핑 방법		ToyPriceInfo 인스턴스 -> String 인스턴스(모델명)
 */

import java.util.List;
import java.util.ArrayList;

class ToyPriceInfo {	// 장난감 모델 별 가격 정보
	private String model;	// 모델 명
	private int price;		// 가격

	public ToyPriceInfo(String m, int p) {
		model = m;
		price = p;
	}

	public String getModel() {
		return model;
	}

	public int getPrice() {
		return price;
	}
}

class qu29_2 {
	public static void main(String[] args) {
		List<ToyPriceInfo> ls = new ArrayList<>();
		ls.add(new ToyPriceInfo("GUN_LR_45", 200));
		ls.add(new ToyPriceInfo("TEDDY_BEAR_S_014", 350));
		ls.add(new ToyPriceInfo("CAR_TRANSFROM_VER_7719", 550));

		ls.stream()
			.filter(p -> p.getModel().length() > 10)
			.map(p -> p.getModel())
			.forEach(System.out::println);
	}
}

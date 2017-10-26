/*
 * 밑변과 높이 정보를 저장할 수 있는 Triangle 클래스를 정의하자. (그 안에 적절한 생성자도 정의하자.)
 * 그리고 밑변과 높이 정보를 변경할 수 있는 메소드와 삼각형의 넓이를 계산해서 반환하는 메소드도 함께 정의하자.
 * 물론 이 클래스의 활용의 예를 보이는 main 메소드도 함께 작성해야 한다.
 */

class Triangle {
	double base;	// 밑변
	double height;	// 높이

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getExtent() {
		return base * height / 2;
	}
}

class qu07_1 {
	public static void main(String[] args) {
		Triangle triangle = new Triangle(3, 5);
		System.out.println("삼각형의 넓이 : " + triangle.getExtent());

		triangle.setBase(7.5);
		triangle.setBase(9.2);
		System.out.println("삼각형의 넓이 : " + triangle.getExtent());
	}
}


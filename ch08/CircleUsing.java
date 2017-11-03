class CircleUsing {
	public static void main(String args[]) {
		com.wxfx.smart.Circle c1 = new com.wxfx.smart.Circle(3.5);
		System.out.println("반지름 3.5 원 넓이: " + c1.getArea());

		com.wxfx.simple.Circle c2 = new com.wxfx.simple.Circle(3.5);
		System.out.println("반지름 3.5 원 둘레: " + c2.getPerimeter());
	}
}

/*
 * 아래의 Point 클래스와 Rectangle 클래스에 내용 비교를 위한 equals 메소드를 각각 삽입하자.
 * 그리고 정의한 equals 메소드의 확인을 위한 main 메소드도 직접 정의하자.
 */

class Point {
	private int xPos;
	private int yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	@Override
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(this.xPos == p.xPos && this.yPos == p.yPos)
			return true;
		else
			return false;
	}
}

class Rectangle {
	private Point upperLeft;	// 좌측 상단 좌표
	private Point lowerRight;	// 우측 하단 좌표

	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}

	@Override
	public boolean equals(Object obj) {
		Rectangle r = (Rectangle)obj;
		if(this.upperLeft.equals(r.upperLeft) && this.lowerRight.equals(r.lowerRight))
			return true;
		else
			return false;
	}
}

class qu19_1 {
	public static void main(String[] args) {
		Point p1 = new Point(1, 2);
		Point p2 = new Point(1, 2);
		Point p3 = new Point(1, 3);

		Rectangle r1 = new Rectangle(1, 2, 3, 4);
		Rectangle r2 = new Rectangle(1, 2, 3, 4);
		Rectangle r3 = new Rectangle(1, 3, 3, 4);

		if(p1.equals(p2))
			System.out.println("p1과 p2의 내용은 동일합니다.");
		else
			System.out.println("p1과 p2의 내용은 다릅니다.");
		if(p1.equals(p3))
			System.out.println("p1과 p3의 내용은 동일합니다.");
		else
			System.out.println("p1과 p3의 내용은 다릅니다.");

		if(r1.equals(r2))
			System.out.println("r1과 r2의 내용은 동일합니다.");
		else
			System.out.println("r1과 r2의 내용은 다릅니다.");
		if(r1.equals(r3))
			System.out.println("r1과 r3의 내용은 동일합니다.");
		else
			System.out.println("r1과 r3의 내용은 다릅니다.");
	}
}

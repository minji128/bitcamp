package ch05_상속;
class Point2{
	private int x,y; // 한 점을 구성하는 x, y 좌표
	public Point2() {
		this.x = this.y = 0;
	}
	public Point2(int x, int y) {
		this.x=x; this.y = y;
	}
	public void showPoint() { // 점의 좌표 출력
		System.out.println("("+x+"," + y + ")");
	}
}

class ColorPoint2 extends Point2{ // Point를 상속받는 colorPoint 선언
	private String color; // 점의 색
	public ColorPoint2(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void showColorPoint() { // 컬러점의 좌표 출력
		System.out.print(color);
		showPoint(); // Point 클래스의 showPoint() 호출
	}
}
public class SuperEx {
	public static void main(String[] args) {
		ColorPoint2 cp = new ColorPoint2(5, 6, "blue"); 
		cp.showColorPoint(); // 컬러의 좌표 춮력
	}
}
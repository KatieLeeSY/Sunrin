package java20170824;

class Point {
	private int x, y;

	public Point(int x, int y) {	// int x, int y -> 파라미터(매개변수)
		// 매개변수는 함수 내에서 전달 된 값을 받아들이는 변수
		//super();		// 부모클래스(오브젝트)를 가리킴
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}

public class ToStringExam3 {
	public static void main(String[] args) {
		Point p = new Point(10, 20);
		// 인자 값은 함수를 호출하는데 있어서 호출 시 전달하는 값
		System.out.println(p.toString());
		System.out.println(p);
	}
}

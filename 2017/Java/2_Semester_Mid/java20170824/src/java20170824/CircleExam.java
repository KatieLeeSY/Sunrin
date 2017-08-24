package java20170824;

class Circle {
	private int x, y, radius;

	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle(" + x + "," + y + "," + radius + ")";
	}

}

public class CircleExam {
	public static void main(String[] args) {
		Circle obj = new Circle(2, 3, 30);
		System.out.println("¿ø obj: " + obj);
	}
}
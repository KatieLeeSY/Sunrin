package java20170824;

class Point {
	private int x, y;

	public Point(int x, int y) {	// int x, int y -> �Ķ����(�Ű�����)
		// �Ű������� �Լ� ������ ���� �� ���� �޾Ƶ��̴� ����
		//super();		// �θ�Ŭ����(������Ʈ)�� ����Ŵ
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
		// ���� ���� �Լ��� ȣ���ϴµ� �־ ȣ�� �� �����ϴ� ��
		System.out.println(p.toString());
		System.out.println(p);
	}
}

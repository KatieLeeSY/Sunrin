package exam04_�ǽ�����3;

class Shape{
	int x,y;
	public void draw(){
		System.out.println("shape�� �׸�");
	}
}
class Rectangle extends Shape{
	int width, height;
	public void draw(){ // �޼ҵ� �������̵� : �θ� �޼ҵ� �����ϱ�
		System.out.println("�簢���� �׸�");
	}
}
class Circle extends Shape{
	public void draw(){ // �޼ҵ� �������̵�
		System.out.println("���� �׸�");
	}
}
public class ShapeTest {
	public static void main(String[] args) {
//		Shape[] shapeArray = new Shape[3]; // Shape�������� 3���� �迭����
//		
//		shapeArray[0] = new Shape();
//		shapeArray[1] = new Rectangle(); // �� ĳ����
//		shapeArray[2] = new Circle();    // �� ĳ����
	
		Shape[] shapeArray = {
			new Shape(), 
			new Rectangle(),
			new Circle()
		};  // int array[] = { 1,2,3};
		
//		for(int i =0; i<shapeArray.length; i++)
//			shapeArray[i].draw();
		
		// ���� for ��
		// for( �迭Ÿ��  ������ : �迭) { ���๮; }
		for(Shape s : shapeArray)
			s.draw();
		
//		// for-each������
//		int array[] = new int[] { 1,2,3,4,5 };
//		for(int i: array)
//			System.out.println(i);
		
		
		
		
//		Shape s = new Rectangle(); // �� ĳ����
//		s.x = 2;
//		s.y = 10;
//		
//		Rectangle r = (Rectangle) s; // �ٿ�ĳ����
//		r.width = 30;
//		r.height = 50;

	}

}

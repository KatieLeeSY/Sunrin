package exam04_실습예제3;

class Shape{
	int x,y;
	public void draw(){
		System.out.println("shape를 그림");
	}
}
class Rectangle extends Shape{
	int width, height;
	public void draw(){ // 메소드 오버라이딩 : 부모 메소드 무시하기
		System.out.println("사각형을 그림");
	}
}
class Circle extends Shape{
	public void draw(){ // 메소드 오버라이딩
		System.out.println("원을 그림");
	}
}
public class ShapeTest {
	public static void main(String[] args) {
//		Shape[] shapeArray = new Shape[3]; // Shape참조변수 3개가 배열원소
//		
//		shapeArray[0] = new Shape();
//		shapeArray[1] = new Rectangle(); // 업 캐스팅
//		shapeArray[2] = new Circle();    // 업 캐스팅
	
		Shape[] shapeArray = {
			new Shape(), 
			new Rectangle(),
			new Circle()
		};  // int array[] = { 1,2,3};
		
//		for(int i =0; i<shapeArray.length; i++)
//			shapeArray[i].draw();
		
		// 향상된 for 문
		// for( 배열타입  변수명 : 배열) { 실행문; }
		for(Shape s : shapeArray)
			s.draw();
		
//		// for-each문예시
//		int array[] = new int[] { 1,2,3,4,5 };
//		for(int i: array)
//			System.out.println(i);
		
		
		
		
//		Shape s = new Rectangle(); // 업 캐스팅
//		s.x = 2;
//		s.y = 10;
//		
//		Rectangle r = (Rectangle) s; // 다운캐스팅
//		r.width = 30;
//		r.height = 50;

	}

}

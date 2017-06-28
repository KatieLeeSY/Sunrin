package ppt9_2;
class cShape{
	public void draw(){
		System.out.println("Shape를 그림");
	}
}
class cRectangle extends cShape{
	public void draw(){
		System.out.println("Rectangle을 그림");
	}
}
class Circle extends cShape{
	public void draw(){
		System.out.println("Circle를 그림");
	}
}
public class Ex04 {
	public static cShape[] shapeArray = {
			new cShape(), 
			new cRectangle(),
			new Circle()
	};
	public static void drawAll(){
		for(cShape s : shapeArray)
			s.draw();
//		for(int i=0;i<shapeArray.length;i++)
//			shapeArray[i].draw();
	}
	public static void main(String[] args) {
		drawAll();
	}
}

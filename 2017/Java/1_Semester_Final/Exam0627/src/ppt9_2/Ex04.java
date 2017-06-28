package ppt9_2;
class cShape{
	public void draw(){
		System.out.println("Shape�� �׸�");
	}
}
class cRectangle extends cShape{
	public void draw(){
		System.out.println("Rectangle�� �׸�");
	}
}
class Circle extends cShape{
	public void draw(){
		System.out.println("Circle�� �׸�");
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

package ppt9_3;
class Father{
	public void say(){
		System.out.println("���� �ƹ����Դϴ�.");
	}
}
class Child extends Father{
	public void say(){
		System.out.println("���� �ڽ��Դϴ�.");
	}
}
public class Ex01 {

	public static void main(String[] args) {
		Father ch = new Child();
		ch.say();
	}

}

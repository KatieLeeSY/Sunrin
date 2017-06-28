package ppt9_3;
class Father{
	public void say(){
		System.out.println("나는 아버지입니다.");
	}
}
class Child extends Father{
	public void say(){
		System.out.println("나는 자식입니다.");
	}
}
public class Ex01 {

	public static void main(String[] args) {
		Father ch = new Child();
		ch.say();
	}

}

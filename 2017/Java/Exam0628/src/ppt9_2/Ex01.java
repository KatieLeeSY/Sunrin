package ppt9_2;
class A{}
class B extends A{}
public class Ex01 {

	public static void main(String[] args) {
		A a = new B();	//upcasting
		//B b = new A();	// X, 자식클래스 참조변수로 부모클래스 객체를 참조할수없음
	}

}

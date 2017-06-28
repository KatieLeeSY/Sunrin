package exam01;
class A{
}
class B extends A{
}
public class TypesTest1 {
	public static void main(String[] args) {
		A a = new B(); // 업 캐스팅
//		B b = new A(); // 자식 참조변수 -> 부모객체 (X)

	}

}

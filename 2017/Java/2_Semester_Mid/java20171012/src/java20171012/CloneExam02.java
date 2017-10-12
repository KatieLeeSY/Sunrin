package java20171012;

class A implements Cloneable {
	int a;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class CloneExam02 {

	public static void main(String[] args) {
		A a1 = new A();
		a1.a = 1;
		A a2 = null;	// clone�� ��ü�� �����ϱ� ���� ���� ������ �θ� ����
		
		try {
			a2 = (A) a1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("a1: " + a1.a);
		System.out.println("a2: " + a2.a);

	}

}

package java20171012;

class Student implements Cloneable {
	private String name;

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class CloneExam03 {
	public static void main(String[] args) {
		Student s1 = new Student("ȫ�浿");
		Student s2 = null;

		try {
			s2 = (Student) s1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // s1 ��ü�� �����Ͽ� s2 ��ü�� �����ϼ���!

		System.out.println("�л�1�� �̸�: " + s1.getName());
		System.out.println("�л�1�� Ŭ���� �л�2�� �̸�: " + s2.getName());
	}

}

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
		Student s1 = new Student("홍길동");
		Student s2 = null;

		try {
			s2 = (Student) s1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // s1 객체를 복제하여 s2 객체를 생성하세요!

		System.out.println("학생1의 이름: " + s1.getName());
		System.out.println("학생1의 클론인 학생2의 이름: " + s2.getName());
	}

}

package java20170829;

public class ExceptionExam02 {
	public static void method() throws ArrayIndexOutOfBoundsException {
		String[] name = new String[3];
		name[3] = "ȫ�浿";
	}

	public static void main(String[] args) {
		try {
			method();
		} catch (Exception e) {
			System.out.println("�迭 ���� �߻�");
		}
	}

}

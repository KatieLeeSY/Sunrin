package java20171012;

class MyException extends Exception { // ����� ���� ����Ŭ���� ����
	MyException() {
	}

	MyException(String message) { // ���ܸ޼����� ���� ��..
		super(message);
	}
}

public class CustomExam {

	public static void main(String[] args) {
		try {
			throw new MyException("ȫ�浿 ���� ��ü");
		} catch (MyException e) {
			System.out.print("���� �߻�: ");
			System.out.println(e.getMessage());
		}
	}

}

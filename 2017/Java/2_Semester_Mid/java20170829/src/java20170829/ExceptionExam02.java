package java20170829;

public class ExceptionExam02 {
	public static void method() throws ArrayIndexOutOfBoundsException {
		String[] name = new String[3];
		name[3] = "홍길동";
	}

	public static void main(String[] args) {
		try {
			method();
		} catch (Exception e) {
			System.out.println("배열 예외 발생");
		}
	}

}

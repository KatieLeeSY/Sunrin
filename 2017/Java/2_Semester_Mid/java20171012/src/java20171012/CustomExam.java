package java20171012;

class MyException extends Exception { // 사용자 정의 예외클래스 정의
	MyException() {
	}

	MyException(String message) { // 예외메세지가 있을 때..
		super(message);
	}
}

public class CustomExam {

	public static void main(String[] args) {
		try {
			throw new MyException("홍길동 예외 객체");
		} catch (MyException e) {
			System.out.print("예외 발생: ");
			System.out.println(e.getMessage());
		}
	}

}

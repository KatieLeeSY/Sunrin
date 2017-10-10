package java20171010;

public class Exam01 {

	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			// 예외가 발생할 수 있는 문장들
			System.out.println(1 / 0); // 0으로 못 나눠줌
			System.out.println(3);
		} catch (NullPointerException e) {
			// NullPointerException 예외클래스 타입일때 처리명령문
			System.out.println("널포인터 익셉션");
		} catch (ArithmeticException e) {
			// ArithmeticException 예외클래스 타입일때 처리명령문
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (Exception e) {
			// 만약 다른 모든 예외를 처리하고 싶으면, 다중catch문의 가장 아래에 위치
			System.out.println("익셉션");
		} finally {
			System.out.println(4);
		}
		System.out.println(5);

	}

}

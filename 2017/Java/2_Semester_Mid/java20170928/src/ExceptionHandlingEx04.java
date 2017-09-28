import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingEx04 {
	public static void main(String[] args) {
		try {
			String a = args[0]; // 명령행 매개변수 첫번째
			String b = args[1]; // 명령행 매개변수 두번째
			int num1 = Integer.parseInt(a);
			int num2 = Integer.parseInt(b);
			System.out.println(a + " + " + b + " = " + (num1 + num2));
		} catch (ArrayIndexOutOfBoundsException ae) {	// [Run Configurations]-[Arguments] 2개 미만
			System.out.println("배열 범위 초과");
		} catch (NumberFormatException nfe) {	// int형이 아닐 때
			System.out.println(nfe.getMessage());
			System.out.println(nfe.toString());
			nfe.printStackTrace();
		} finally { // 어떠한 경우에도 실행됨
			System.out.println("프로그램 종료");
		}
		System.out.println("프로그램 진짜 종료");
	}
}

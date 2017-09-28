import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingEx01 {
	public static void method() throws Exception {
		//try {
			// FileNotFoundException
			FileReader f = new FileReader("a.txt"); // 문자스트림
			int inp;

			while ((inp = f.read()) != -1) { // IOException
				System.out.print((char) inp);
				// 강제 형변환
				// 1 char inp
				// 2 char(inp) -> Python
				// 3 (char) inp -> java
			}
			f.close(); // IOException
		//} catch (Exception e) { // 무슨 예외인지는 모르지만
			//System.out.print("예외가 발생하였습니다.");
		//}
	}

	public static void main(String[] args) /*throws Exception*/ {
		try {
			((new ExceptionHandlingEx01())).method();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

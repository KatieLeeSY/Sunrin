import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingEx03 {
	public static void method() {
		try {
			System.out.println(1 / 0);
		} catch (Exception e) {
			System.out.println("e.getMessage() : " + e.getMessage());
			System.out.println("e.toString() : " + e.toString()); // toString은
																	// object에
																	// 있음
			System.out.println("e.printStackTrace() ==== ");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		method();
	}
}

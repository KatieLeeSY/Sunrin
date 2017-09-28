import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingEx02 {
	public static void main(String[] args) {
		System.out.println(1);

		try {
			System.out.println(2);
			System.out.println(1 / 0);	// ArithmeticException
			System.out.println(3);
		} catch (Exception e) {
			System.out.println(4);
		}

		System.out.println(5);
	}
}

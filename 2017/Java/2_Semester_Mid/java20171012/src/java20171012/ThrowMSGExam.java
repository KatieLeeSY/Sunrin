package java20171012;

public class ThrowMSGExam {

	public static void main(String[] args) {
		int a = 100, b = 0;
		int result;

		try {
			if (b == 0)
				throw new Exception("0으로 나누면 안됩니다.");
		} catch (Exception e) {
			System.out.print("예외발생: ");
			System.out.println(e.getMessage());
		}

	}

}

package java20171012;

public class ThrowMSGExam {

	public static void main(String[] args) {
		int a = 100, b = 0;
		int result;

		try {
			if (b == 0)
				throw new Exception("0���� ������ �ȵ˴ϴ�.");
		} catch (Exception e) {
			System.out.print("���ܹ߻�: ");
			System.out.println(e.getMessage());
		}

	}

}

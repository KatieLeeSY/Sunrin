import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingEx01 {
	public static void method() throws Exception {
		//try {
			// FileNotFoundException
			FileReader f = new FileReader("a.txt"); // ���ڽ�Ʈ��
			int inp;

			while ((inp = f.read()) != -1) { // IOException
				System.out.print((char) inp);
				// ���� ����ȯ
				// 1 char inp
				// 2 char(inp) -> Python
				// 3 (char) inp -> java
			}
			f.close(); // IOException
		//} catch (Exception e) { // ���� ���������� ������
			//System.out.print("���ܰ� �߻��Ͽ����ϴ�.");
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

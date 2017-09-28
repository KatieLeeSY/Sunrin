import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingEx04 {
	public static void main(String[] args) {
		try {
			String a = args[0]; // ����� �Ű����� ù��°
			String b = args[1]; // ����� �Ű����� �ι�°
			int num1 = Integer.parseInt(a);
			int num2 = Integer.parseInt(b);
			System.out.println(a + " + " + b + " = " + (num1 + num2));
		} catch (ArrayIndexOutOfBoundsException ae) {	// [Run Configurations]-[Arguments] 2�� �̸�
			System.out.println("�迭 ���� �ʰ�");
		} catch (NumberFormatException nfe) {	// int���� �ƴ� ��
			System.out.println(nfe.getMessage());
			System.out.println(nfe.toString());
			nfe.printStackTrace();
		} finally { // ��� ��쿡�� �����
			System.out.println("���α׷� ����");
		}
		System.out.println("���α׷� ��¥ ����");
	}
}

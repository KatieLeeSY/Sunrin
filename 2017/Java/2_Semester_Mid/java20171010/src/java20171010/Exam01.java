package java20171010;

public class Exam01 {

	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			// ���ܰ� �߻��� �� �ִ� �����
			System.out.println(1 / 0); // 0���� �� ������
			System.out.println(3);
		} catch (NullPointerException e) {
			// NullPointerException ����Ŭ���� Ÿ���϶� ó����ɹ�
			System.out.println("�������� �ͼ���");
		} catch (ArithmeticException e) {
			// ArithmeticException ����Ŭ���� Ÿ���϶� ó����ɹ�
			System.out.println("0���� ���� �� �����ϴ�.");
		} catch (Exception e) {
			// ���� �ٸ� ��� ���ܸ� ó���ϰ� ������, ����catch���� ���� �Ʒ��� ��ġ
			System.out.println("�ͼ���");
		} finally {
			System.out.println(4);
		}
		System.out.println(5);

	}

}

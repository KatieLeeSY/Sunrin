package java20171010;

import java.util.Scanner;

public class ExceptionExam03 {

	public static void main(String[] args) {
		int[] array = new int[3];
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ a�� �Է�: ");
		a = sc.nextInt();
		System.out.print("������ b�� �Է�: ");
		b = sc.nextInt();
		System.out.print("������ c�� �Է�: ");
		c = sc.nextInt();
		try {
			array[c] = a / b;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �ε����� �����");
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� ����");
		} catch (Exception e) {
			System.out.println("��Ÿ ���ܰ� �߻��Ͽ���");
		} finally {
			System.out.println("���α׷� ������ : Katie");
		}
		
		sc.close();

	}

}

package java20171010;

import java.util.Calendar;

public class Exam06 {

	public static void main(String[] args) {
		// ��¥ ��ü ��������
		Calendar now = Calendar.getInstance(); // �̱���
		// ���� ������
		int year = now.get(Calendar.YEAR); // ����⵵
		int month = now.get(Calendar.MONTH) + 1; // ���� ��
		int day = now.get(Calendar.DAY_OF_MONTH); // ���� ��
		System.out.printf("%d-%d-%d\n", year, month, day);

		// ��ü�� �����غ��ô�
		Calendar now2 = (Calendar) now.clone();
		System.out.println("**��ü�� ����Ϸ�: now2");
		now2.set(2017, 11, 31); // 2017-12-31����
		System.out.println("**now2�� ������ ����Ϸ�");
		int year2 = now2.get(Calendar.YEAR); // now2 �⵵ ���� ��������
		int month2 = now2.get(Calendar.MONTH) + 1; // now2 �� ���� ��������
		int day2 = now.get(Calendar.DAY_OF_MONTH); // now2 ��¥ ����
		System.out.printf("%d-%d-%d\n", year, month, day);
		System.out.printf("%d-%d-%d\n", year2, month2, day2);
	}

}

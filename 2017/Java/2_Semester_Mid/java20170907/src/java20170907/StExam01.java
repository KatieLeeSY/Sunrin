package java20170907;

import java.util.StringTokenizer;

public class StExam01 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("���/��/������", "/");

		System.out.println("���� ��ū ����: " + st.countTokens());

		while (st.hasMoreTokens()) // ��ȯ�� ��ū�� �ִ� ����
			System.out.println(st.nextToken()); // ���ʴ�� ��ū ��ȯ -> ���

		System.out.println("�ݺ��� �� ��ū ����: " + st.countTokens());

		// ���� �������� �ڸ�

		// String s1 = st.nextToken(); // ù��° ��ū�� "���" ��ȯ
		// System.out.println(s1);
		//
		// String s2 = st.nextToken(); // �ι�° ��ū�� "��" ��ȯ
		// System.out.println(s2);
		//
		// String s3 = st.nextToken(); // ����° ��ū�� "������" ��ȯ
		// System.out.println(s3);

	}

}

package java20170914;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class CharExam01 {

	public static void main(String[] args) throws Exception {
		// 1. ��Ʈ������
		InputStream is = System.in; // Ű���� : ����Ʈ��Ʈ��
		Reader r = new InputStreamReader(is); // ����Ʈ -> ���ڽ�Ʈ��

		// 2. ������ �����
		int input;
		while (true) {
			input = r.read(); // 1���� 2����Ʈ �Է¹���
			if (input == -1) // ��Ʈ���� ���� �ٴٸ��� = -1 �߻�
				break;
			System.out.print((char) input);
		}
		is.close();

	}

}

package java20170905;

import java.io.InputStreamReader;
import java.io.Reader;

public class ByteExam01 {

	public static void main(String[] args) throws Exception {
		int i;
		Reader inp = new InputStreamReader(System.in);	// ���ڽ�Ʈ��
		while (true) {
			//i = System.in.read();	// ����Ʈ��Ʈ�� Ű���� �Է�
			i = inp.read();
			if (i == -1)	// ctrl + z �Է��� ������
				break;
			System.out.print((char) i);	// ����Ʈ��Ʈ�� ����� ���
		}
	}

}

package java20170907;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Exam03 {

	public static void main(String[] args) throws Exception {
		// 1 ��Ʈ�� ��ü ����
				FileInputStream fi = new FileInputStream("C:\\windows\\system.ini");
				FileOutputStream fo = new FileOutputStream("system.txt");

				// 2 ��Ʈ�� ��ü �޼ҵ带 �̿��ؼ� ������ �����
				int inp;
				while ((inp = fi.read()) != -1) // -1 : ���� ���� ����������
					fo.write(inp);

				// 3 ��Ʈ�� �ݱ�
				fo.close();
				fi.close();

	}

}

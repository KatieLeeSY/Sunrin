package java20170831;

import java.io.*;

public class Exam03 {

	public static void main(String[] args) throws IOException {
		// ��Ʈ�� ����
		InputStream is = new FileInputStream("a.jpg");
		OutputStream os = new FileOutputStream("copy.jpg");
		int bt;
		
		// ��Ʈ�� �޼ҵ� �̿�
		while((bt=is.read()) != -1)		// "-1 = ������ ��"�� ������ ������
			os.write(bt);				//	������ ������ ����
		
		// ��Ʈ�� �ݾ���
		os.close();
		is.close();
	}

}

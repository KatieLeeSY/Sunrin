package java20170905;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Exam03 {

	public static void main(String[] args) throws Exception {
		// 1. ��Ʈ�� ����
		FileInputStream fi = new FileInputStream("a.jpg");
		FileOutputStream fo = new FileOutputStream("copy.jpg");
		
		// 2. ��Ʈ�� �̿��ؼ� ������ ����� �۾��� ���� (�޼ҵ带 ȣ��)
		int inp;
		while(true) {
			inp = fi.read();	// a.jpg ���Ϸκ��� 1byte �о�� -> int ��ȯ
			if(inp == -1)
				break;
			fo.write(inp); 		// copy.jpg���Ͽ� 1byte�� (int)
		}
		
		// 3. ��Ʈ�� �ݱ�
		fo.close();
		fi.close();
	}

}

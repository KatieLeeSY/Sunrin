package java20170905;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class NewExam {

	public static void main(String[] args) throws Exception {
		// 1 ��Ʈ����ü ����
		BufferedInputStream fi = new BufferedInputStream(new FileInputStream("heavy.data"));
		BufferedOutputStream fo = new BufferedOutputStream(new FileOutputStream("copy.data"));
		int i;
		
		// 2 ��Ʈ����ü �޼ҵ带 �̿��ؼ� �����۾� (������ �����)
		long start = System.currentTimeMillis();
		while((i=fi.read())!=-1)
			fo.write(i);
		long end = System.currentTimeMillis();
		
		// 3 ��Ʈ���� �ݾ���
		fo.close();
		fi.close();
		
		System.out.println("�����ϴµ� �ɸ��ð�: " + (end-start));
	}

}

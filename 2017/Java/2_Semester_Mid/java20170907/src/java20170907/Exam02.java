package java20170907;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Exam02 {

	public static void main(String[] args) throws Exception {
		// 1 ��Ʈ�� ��ü ����
		FileOutputStream fo = new FileOutputStream("c.txt");

		// 2 ��Ʈ�� ��ü �޼ҵ带 �̿��ؼ� ������ �����
		int inp;
		while ((inp = System.in.read()) != -1) // -1 : ���� ���� ����������
			fo.write(inp);

		// 3 ��Ʈ�� �ݱ�
		fo.close();

	}

}

package java20170919;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharExam09 {

	public static void main(String[] args) throws Exception {
		// 1.��Ʈ����ü����
		// File file = new File("a.txt");
		// FileWriter fw = new FileWriter(file);
		// PrintWriter pw = new PrintWriter(fw);
		PrintWriter pw = new PrintWriter("b.txt");

		// 2.���������
		pw.printf("%d + %d = %d \n", 1, 2, (1 + 2));
		pw.println("�������� �ڰ� �־�� �ݿ�..");
		pw.print("��찡 ������ �����.");

		// 3.��Ʈ���ݱ�
		pw.close();
	}

}

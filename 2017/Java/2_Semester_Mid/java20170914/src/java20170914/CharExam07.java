package java20170914;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharExam07 {

	public static void main(String[] args) throws Exception {
		BufferedWriter fw = new BufferedWriter(new FileWriter("c.txt"));
		fw.write("�������ͳݰ���б�");
		fw.newLine();
		fw.write("�����");
		fw.newLine();
		fw.write("2�г�");
		fw.close();

	}

}

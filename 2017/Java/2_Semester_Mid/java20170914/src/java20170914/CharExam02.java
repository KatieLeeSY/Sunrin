package java20170914;

import java.io.FileReader;
import java.io.FileWriter;

public class CharExam02 {

	public static void main(String[] args) throws Exception {
		// 1. ��Ʈ�� ����
		FileReader fr = new FileReader("a.txt");
		FileWriter fw = new FileWriter("copy.txt");

		// 2. ������ �����
		int input;
		while (true) {
			input = fr.read();
			if (input == -1)
				break;
			fw.write(input);
		}

		// 3. ��Ʈ�� �ݱ�
		fw.close();
		fr.close();

	}

}

package java20170914;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class CharExam04 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Writer bw = new OutputStreamWriter(System.out);

		String input; // �Է°��� �����ϴ� ���� : String

		while (true) {
			input = br.readLine();
			if (input == null) // ��Ʈ�� ���� �ٴٸ� �� == null��
				break;
			bw.write(input + "\n");
			bw.flush();
		}
		bw.close();
		br.close();

	}

}

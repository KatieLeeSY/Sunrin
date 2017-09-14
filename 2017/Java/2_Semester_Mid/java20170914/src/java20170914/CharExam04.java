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

		String input; // 입력값을 저장하는 변수 : String

		while (true) {
			input = br.readLine();
			if (input == null) // 스트림 끝에 다다를 때 == null값
				break;
			bw.write(input + "\n");
			bw.flush();
		}
		bw.close();
		br.close();

	}

}

package java20170914;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class CharExam01 {

	public static void main(String[] args) throws Exception {
		// 1. 스트림생성
		InputStream is = System.in; // 키보드 : 바이트스트림
		Reader r = new InputStreamReader(is); // 바이트 -> 문자스트림

		// 2. 데이터 입출력
		int input;
		while (true) {
			input = r.read(); // 1번에 2바이트 입력받음
			if (input == -1) // 스트림의 끝에 다다르면 = -1 발생
				break;
			System.out.print((char) input);
		}
		is.close();

	}

}

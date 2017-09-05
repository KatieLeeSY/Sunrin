package java20170905;

import java.io.InputStreamReader;
import java.io.Reader;

public class ByteExam01 {

	public static void main(String[] args) throws Exception {
		int i;
		Reader inp = new InputStreamReader(System.in);	// 문자스트림
		while (true) {
			//i = System.in.read();	// 바이트스트림 키보드 입력
			i = inp.read();
			if (i == -1)	// ctrl + z 입력할 때까지
				break;
			System.out.print((char) i);	// 바이트스트림 모니터 출력
		}
	}

}

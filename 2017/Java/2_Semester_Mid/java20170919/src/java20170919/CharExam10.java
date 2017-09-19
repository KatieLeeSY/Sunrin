package java20170919;

import java.io.FilterReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

class MyFilter extends FilterReader {
	protected MyFilter(Reader in) {
		super(in); // FilterReader가 갖는 생성자를 호출
	}

	@Override
	public int read() throws IOException {
		int input;
		return ((input = super.read()) == -1) ? input : Character.toUpperCase((char) input);
	}

}

public class CharExam10 {

	public static void main(String[] args) throws Exception {
		// 스트림 생성
		MyFilter my = new MyFilter(new InputStreamReader(System.in));
		
		// 데이터 입출력
		int input;
		while(true) {
			input = my.read();
			if(input == -1)
				break;
			System.out.print((char)input);
		}
		
		// 스트림 닫기
		my.close();

	}

}

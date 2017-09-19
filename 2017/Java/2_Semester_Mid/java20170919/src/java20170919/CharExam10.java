package java20170919;

import java.io.FilterReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

class MyFilter extends FilterReader {
	protected MyFilter(Reader in) {
		super(in); // FilterReader�� ���� �����ڸ� ȣ��
	}

	@Override
	public int read() throws IOException {
		int input;
		return ((input = super.read()) == -1) ? input : Character.toUpperCase((char) input);
	}

}

public class CharExam10 {

	public static void main(String[] args) throws Exception {
		// ��Ʈ�� ����
		MyFilter my = new MyFilter(new InputStreamReader(System.in));
		
		// ������ �����
		int input;
		while(true) {
			input = my.read();
			if(input == -1)
				break;
			System.out.print((char)input);
		}
		
		// ��Ʈ�� �ݱ�
		my.close();

	}

}

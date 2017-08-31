package java20170831;

import java.io.IOException;

public class Exam01 {
	public static void main(String[] args) throws IOException {
		int bt = 0;
		
		bt = System.in.read();			//	입력
		
		System.out.println("char: "+(char)bt);	//	출력
		System.out.println("int: "+bt);
	}
}

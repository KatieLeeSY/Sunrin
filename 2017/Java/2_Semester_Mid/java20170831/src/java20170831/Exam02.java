package java20170831;

import java.io.IOException;

public class Exam02 {

	public static void main(String[] args) throws IOException {
		int bt = 0;
		
		while(true) {
			bt = System.in.read();
			if(bt == -1)
				break;
			System.out.println((char)bt);
		}

	}

}

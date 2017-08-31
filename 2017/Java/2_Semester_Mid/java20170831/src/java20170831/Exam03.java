package java20170831;

import java.io.*;

public class Exam03 {

	public static void main(String[] args) throws IOException {
		// 스트림 생성
		InputStream is = new FileInputStream("a.jpg");
		OutputStream os = new FileOutputStream("copy.jpg");
		int bt;
		
		// 스트림 메소드 이용
		while((bt=is.read()) != -1)		// "-1 = 파일의 끝"에 도달할 때까지
			os.write(bt);				//	파일의 내용을 복사
		
		// 스트림 닫아줌
		os.close();
		is.close();
	}

}

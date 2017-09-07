package java20170907;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Exam03 {

	public static void main(String[] args) throws Exception {
		// 1 스트림 객체 생성
				FileInputStream fi = new FileInputStream("C:\\windows\\system.ini");
				FileOutputStream fo = new FileOutputStream("system.txt");

				// 2 스트림 객체 메소드를 이용해서 데이터 입출력
				int inp;
				while ((inp = fi.read()) != -1) // -1 : 파일 끝에 도달했을때
					fo.write(inp);

				// 3 스트림 닫기
				fo.close();
				fi.close();

	}

}

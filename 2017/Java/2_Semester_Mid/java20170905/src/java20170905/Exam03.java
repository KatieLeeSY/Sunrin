package java20170905;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Exam03 {

	public static void main(String[] args) throws Exception {
		// 1. 스트림 생성
		FileInputStream fi = new FileInputStream("a.jpg");
		FileOutputStream fo = new FileOutputStream("copy.jpg");
		
		// 2. 스트림 이용해서 데이터 입출력 작업을 수행 (메소드를 호출)
		int inp;
		while(true) {
			inp = fi.read();	// a.jpg 파일로부터 1byte 읽어옴 -> int 반환
			if(inp == -1)
				break;
			fo.write(inp); 		// copy.jpg파일에 1byte씀 (int)
		}
		
		// 3. 스트림 닫기
		fo.close();
		fi.close();
	}

}

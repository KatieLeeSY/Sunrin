package java20170907;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Exam02 {

	public static void main(String[] args) throws Exception {
		// 1 스트림 객체 생성
		FileOutputStream fo = new FileOutputStream("c.txt");

		// 2 스트림 객체 메소드를 이용해서 데이터 입출력
		int inp;
		while ((inp = System.in.read()) != -1) // -1 : 파일 끝에 도달했을때
			fo.write(inp);

		// 3 스트림 닫기
		fo.close();

	}

}

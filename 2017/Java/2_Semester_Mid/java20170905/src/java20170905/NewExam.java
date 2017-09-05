package java20170905;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class NewExam {

	public static void main(String[] args) throws Exception {
		// 1 스트림객체 생성
		BufferedInputStream fi = new BufferedInputStream(new FileInputStream("heavy.data"));
		BufferedOutputStream fo = new BufferedOutputStream(new FileOutputStream("copy.data"));
		int i;
		
		// 2 스트림객체 메소드를 이용해서 복사작업 (데이터 입출력)
		long start = System.currentTimeMillis();
		while((i=fi.read())!=-1)
			fo.write(i);
		long end = System.currentTimeMillis();
		
		// 3 스트림을 닫아줌
		fo.close();
		fi.close();
		
		System.out.println("복사하는데 걸린시간: " + (end-start));
	}

}

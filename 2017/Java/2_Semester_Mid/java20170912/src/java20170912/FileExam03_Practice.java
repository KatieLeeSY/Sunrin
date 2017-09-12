package java20170912;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class FileExam03_Practice {
	public static void main(String[] args) throws Exception {
		// 스트림 생성
		File file = new File("java.zip");
		ZipInputStream is = new ZipInputStream(new FileInputStream(file));
		OutputStream os = null;
		// 스트림 객체 메소드를 통한 복사
		int input;
		ZipEntry entry;	// zip파일 엔트리
		while((entry = is.getNextEntry()) != null) {
			os = new FileOutputStream(entry.getName());
			while((input = is.read())!= -1)
				os.write(input);
		}
		
		os.close();
		is.close();
	}
}

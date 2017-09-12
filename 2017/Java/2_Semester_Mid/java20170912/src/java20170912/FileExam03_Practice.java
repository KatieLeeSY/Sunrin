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
		// ��Ʈ�� ����
		File file = new File("java.zip");
		ZipInputStream is = new ZipInputStream(new FileInputStream(file));
		OutputStream os = null;
		// ��Ʈ�� ��ü �޼ҵ带 ���� ����
		int input;
		ZipEntry entry;	// zip���� ��Ʈ��
		while((entry = is.getNextEntry()) != null) {
			os = new FileOutputStream(entry.getName());
			while((input = is.read())!= -1)
				os.write(input);
		}
		
		os.close();
		is.close();
	}
}

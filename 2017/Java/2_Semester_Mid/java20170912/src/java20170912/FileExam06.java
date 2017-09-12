package java20170912;

import java.io.File;

public class FileExam06 {

	public static void main(String[] args) {
		// 1. ��ü ����
		File file = new File(".");	// ������Ʈ ����
		// 2. ���� ����Ʈ ���� ����
		File[] list = file.listFiles();		// ��ü �迭
		// 3. ī����
		int fileCnt = 0, dirCnt = 0;
		
		for(File f : list) {
			if(f.isFile())
				fileCnt++;
			else if(f.isDirectory())
				dirCnt++;
		}
		// 4. ���
		System.out.println("���� ���� : " + fileCnt);
		System.out.println("���丮 ���� : " + dirCnt);

	}

}

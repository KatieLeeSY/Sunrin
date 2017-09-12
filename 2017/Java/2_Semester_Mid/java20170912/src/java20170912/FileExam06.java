package java20170912;

import java.io.File;

public class FileExam06 {

	public static void main(String[] args) {
		// 1. 객체 생성
		File file = new File(".");	// 프로젝트 폴더
		// 2. 파일 리스트 가져 오기
		File[] list = file.listFiles();		// 객체 배열
		// 3. 카운팅
		int fileCnt = 0, dirCnt = 0;
		
		for(File f : list) {
			if(f.isFile())
				fileCnt++;
			else if(f.isDirectory())
				dirCnt++;
		}
		// 4. 출력
		System.out.println("파일 개수 : " + fileCnt);
		System.out.println("디렉토리 개수 : " + dirCnt);

	}

}

package java20170912;

import java.io.File;

public class FileExam02 {

	public static void main(String[] args) {
		File f = new File("c:/windows/system.ini");
		String res = null;
		if(f.isFile())res = "파일";
		else if(f.isDirectory())res = "디렉토리";
		System.out.println(f.getPath() + "는 " + res + "입니다.");
	}

}

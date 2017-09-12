package java20170912;

import java.io.File;

public class FileExam01 {

	public static void main(String[] args) {
		File file = new File("./src/java20170912","FileExam01.java");
		System.out.println("파일 이름은? " + file.getName());
		System.out.println("파일이 존재하나요? " + file.exists());
		System.out.println("속성이 파일인가요? " + file.isFile());
		System.out.println("속성이 디렉토리(폴더)인가요? " + file.isDirectory());
		System.out.println("파일의 크기는? " + file.length());
		
		System.out.println("현재 디렉토리에 있는 파일과 하위 디렉토리는?");
		File dir = new File(".");
		String[] list = dir.list();
		for(String s : list)
			System.out.println(s);
		
		System.out.println("------------");
		File[] files = dir.listFiles();
		for(File f : files)
			System.out.println(f.getName());
	}

}

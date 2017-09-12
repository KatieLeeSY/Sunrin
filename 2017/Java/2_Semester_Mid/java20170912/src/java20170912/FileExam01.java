package java20170912;

import java.io.File;

public class FileExam01 {

	public static void main(String[] args) {
		File file = new File("./src/java20170912","FileExam01.java");
		System.out.println("���� �̸���? " + file.getName());
		System.out.println("������ �����ϳ���? " + file.exists());
		System.out.println("�Ӽ��� �����ΰ���? " + file.isFile());
		System.out.println("�Ӽ��� ���丮(����)�ΰ���? " + file.isDirectory());
		System.out.println("������ ũ���? " + file.length());
		
		System.out.println("���� ���丮�� �ִ� ���ϰ� ���� ���丮��?");
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

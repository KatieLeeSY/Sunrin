package java20170912;

import java.io.File;

public class FileExam02 {

	public static void main(String[] args) {
		File f = new File("c:/windows/system.ini");
		String res = null;
		if(f.isFile())res = "����";
		else if(f.isDirectory())res = "���丮";
		System.out.println(f.getPath() + "�� " + res + "�Դϴ�.");
	}

}

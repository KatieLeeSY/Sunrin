package java20170914;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharExam07 {

	public static void main(String[] args) throws Exception {
		BufferedWriter fw = new BufferedWriter(new FileWriter("c.txt"));
		fw.write("선린인터넷고등학교");
		fw.newLine();
		fw.write("웹운영과");
		fw.newLine();
		fw.write("2학년");
		fw.close();

	}

}

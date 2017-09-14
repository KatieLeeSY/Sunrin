package java20170914;

import java.io.BufferedReader;
import java.io.*;

public class CharExam08 {

	public static void main(String[] args) throws Exception {
		BufferedReader fr = new BufferedReader(new FileReader("c.txt"));
		BufferedWriter fw = new BufferedWriter(new FileWriter("copy2.txt"));
		String inp;

		while ((inp = fr.readLine()) != null) {
			fw.write(inp);
			fw.newLine();
		}

		fw.close();
		fr.close();
	}

}

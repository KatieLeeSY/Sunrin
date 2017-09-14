package java20170914;

import java.io.*;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;

public class CharExam05 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		Writer w = new OutputStreamWriter(System.out);
		String input = null;

		while (true) {
			input = br.readLine();
			if (input == null)
				break;
			w.write(input + "\n");
			w.flush();
		}
		br.close();

	}

}

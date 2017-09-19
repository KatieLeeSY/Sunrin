package java20170919;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharExam09 {

	public static void main(String[] args) throws Exception {
		// 1.스트림객체생성
		// File file = new File("a.txt");
		// FileWriter fw = new FileWriter(file);
		// PrintWriter pw = new PrintWriter(fw);
		PrintWriter pw = new PrintWriter("b.txt");

		// 2.데이터출력
		pw.printf("%d + %d = %d \n", 1, 2, (1 + 2));
		pw.println("박태준이 자고 있어요 반에..");
		pw.print("헌우가 데리러 갔어요.");

		// 3.스트림닫기
		pw.close();
	}

}

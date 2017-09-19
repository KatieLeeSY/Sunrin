package java20170919;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Exam01 {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader(new File("data.txt"));
		BufferedReader br = new BufferedReader(fr);
		String tmp = "", data = "";

		while ((tmp = br.readLine()) != null)
			data = data + tmp + "\t";
		StringTokenizer st = new StringTokenizer(data);
		int length = st.countTokens() / 4;
		String[] name = new String[length];
		String[] address = new String[length];
		double[] math = new double[length];
		double[] english = new double[length];
		double[] total = new double[length];
		double[] avg = new double[length];

		System.out.println("성명" + "\t" + "주소" + "\t" + "수학 " + "\t" + "영어" + "\t" + "합계" + "\t" + "평균");
		for (int i = 0; i < length; i++) {
			name[i] = st.nextToken();
			address[i] = st.nextToken();
			math[i] = Double.parseDouble(st.nextToken());
			english[i] = Double.parseDouble(st.nextToken());
			total[i] = math[i] + english[i];
			avg[i] = total[i] / 2.0;
			System.out.println(
					name[i] + "\t" + address[i] + "\t" + math[i] + "\t" + english[i] + "\t" + total[i] + "\t" + avg[i]);
		}
		br.close();
	}

}

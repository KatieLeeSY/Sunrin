package java20170914;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharExam06 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a, b;
		int sum, aInt, bInt;
		double average = 0;

		System.out.print("Enter the String(정수 1개): ");
		a = br.readLine();
		System.out.print("Enter the STring(정수 1개): ");
		b = br.readLine();

		aInt = Integer.parseInt(a);
		bInt = Integer.parseInt(b);
		sum = aInt + bInt;
		average = (double) sum / 2;
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println("평균 : " + average);

	}

}

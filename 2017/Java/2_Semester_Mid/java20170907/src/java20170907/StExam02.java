package java20170907;

import java.util.StringTokenizer;

public class StExam02 {

	public static void main(String[] args) {
		String s = "����/���ͳ�/����б�/��/���";

		// 1. StringTokenizer Ŭ������ �� ���
		StringTokenizer st = new StringTokenizer(s, "/");
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());
		
		System.out.println("-------------------");
		
		// 2. Split() �޼ҵ带 �� ���
		String[] array = s.split("/");
		for(String token : array)
			System.out.println(token);
		

	}

}

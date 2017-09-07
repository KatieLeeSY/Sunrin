package java20170907;

import java.util.StringTokenizer;

public class StExam02 {

	public static void main(String[] args) {
		String s = "선린/인터넷/고등학교/웹/운영과";

		// 1. StringTokenizer 클래스를 쓴 경우
		StringTokenizer st = new StringTokenizer(s, "/");
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());
		
		System.out.println("-------------------");
		
		// 2. Split() 메소드를 쓴 경우
		String[] array = s.split("/");
		for(String token : array)
			System.out.println(token);
		

	}

}

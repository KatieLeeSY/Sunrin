package java20170907;

import java.util.StringTokenizer;

public class StExam01 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("사과/배/복숭아", "/");

		System.out.println("현재 토큰 개수: " + st.countTokens());

		while (st.hasMoreTokens()) // 반환할 토큰이 있는 동안
			System.out.println(st.nextToken()); // 차례대로 토큰 반환 -> 출력

		System.out.println("반복문 후 토큰 개수: " + st.countTokens());

		// 공백 기준으로 자름

		// String s1 = st.nextToken(); // 첫번째 토큰인 "사과" 반환
		// System.out.println(s1);
		//
		// String s2 = st.nextToken(); // 두번째 토큰인 "배" 반환
		// System.out.println(s2);
		//
		// String s3 = st.nextToken(); // 세번째 토큰인 "복숭아" 반환
		// System.out.println(s3);

	}

}

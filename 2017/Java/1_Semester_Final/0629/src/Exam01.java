
public class Exam01 {

	public static void main(String[] args) {
		String s = "I love you";
		System.out.println(s.length());
		System.out.println("가나다".length());
		//공백제거
		System.out.println("["+s.trim()+"]");
		//서브스트링
		System.out.println(s.substring(2));
		//문자열의 문자 추출
		System.out.println(s.charAt(2));
		//charAt() 이용해서 문자열 출력
		for(int i=0;i<s.length();i++){
			System.out.print(s.charAt(i)+"/");
			if(i==s.length()-1)System.out.println();
		}
		System.out.println(s);
	}

}


public class Exam02 {
	public static void main(String[] args) {
		//12345678901234567890123456
		//WangLyul is a teacher
		//WangLyul is a good teacher
		
		StringBuffer s = new StringBuffer("WangLyul");
		//문자열 " is a teacher."를 끝에 추가하기
		System.out.println(s.append(" is a teacher."));
		//문자열 삽입하기
		System.out.println(s.insert(14, "good "));
		//문자열 바꾸기
		System.out.println(s.replace(14, 18, "great"));
		//현재 문자열 출력
		System.out.println(s);
	}

}

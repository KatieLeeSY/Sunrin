package java20171010;

public class ExceptionExam04 {
	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("°´Ã¼ ¾øÀ½: " + e.toString());
		}
	}
}

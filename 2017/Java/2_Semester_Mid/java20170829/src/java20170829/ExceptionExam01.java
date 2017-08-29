package java20170829;

public class ExceptionExam01 {

	public static void main(String[] args) {
		int[] array = new int[10];
		for(int i=0;i<array.length;i++)
			array[i]=i+1;
		try {
			array[10]=11;	
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 접근 초과 발생");
		}
		
		System.out.println("저는 실행이 될까요?");

	}

}

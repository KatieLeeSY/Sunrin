
public class Exam02 {
	public static void main(String[] args) {
		//12345678901234567890123456
		//WangLyul is a teacher
		//WangLyul is a good teacher
		
		StringBuffer s = new StringBuffer("WangLyul");
		//���ڿ� " is a teacher."�� ���� �߰��ϱ�
		System.out.println(s.append(" is a teacher."));
		//���ڿ� �����ϱ�
		System.out.println(s.insert(14, "good "));
		//���ڿ� �ٲٱ�
		System.out.println(s.replace(14, 18, "great"));
		//���� ���ڿ� ���
		System.out.println(s);
	}

}

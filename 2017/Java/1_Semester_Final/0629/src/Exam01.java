
public class Exam01 {

	public static void main(String[] args) {
		String s = "I love you";
		System.out.println(s.length());
		System.out.println("������".length());
		//��������
		System.out.println("["+s.trim()+"]");
		//���꽺Ʈ��
		System.out.println(s.substring(2));
		//���ڿ��� ���� ����
		System.out.println(s.charAt(2));
		//charAt() �̿��ؼ� ���ڿ� ���
		for(int i=0;i<s.length();i++){
			System.out.print(s.charAt(i)+"/");
			if(i==s.length()-1)System.out.println();
		}
		System.out.println(s);
	}

}

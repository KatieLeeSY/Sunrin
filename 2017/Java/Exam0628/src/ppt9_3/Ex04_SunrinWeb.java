package ppt9_3;
class Sunrin{
	String s = "����";
	Sunrin() {
		s = s + "���ͳݰ�";
	}
	String get(){
		return "���� ������";
	}
}
class Web extends Sunrin{
	String s = "�����";
	Web(){
		s = super.s + s;
	}
	String get(){
		return s;
	}
}
public class Ex04_SunrinWeb {

	public static void main(String[] args) {
		Sunrin sun = new Web();
		System.out.println(sun.s);
		System.out.println(sun.get());

	}

}

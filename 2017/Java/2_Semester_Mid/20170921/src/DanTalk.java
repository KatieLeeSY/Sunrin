import java.util.ArrayList;
import java.util.Arrays;

public class DanTalk {
	private ArrayList<Mark> array; 	// ������ ���
	
	public DanTalk(int size) {
		array = new ArrayList<>();
		System.out.println("��� ����");
	}
	public void enter(Object person) {
		if(person instanceof Mark) {
			array.add((Mark)person);
			System.out.println(person + "enter");
		}
		else {
			System.out.println(person + "enter denied");
		}
	}
	@Override
	public String toString() {
		return "DanTalk [array=" + array + "]";
	}
	
}

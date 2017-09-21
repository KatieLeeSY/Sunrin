import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Exam02 {

	public static void main(String[] args) throws Exception {
		// ObjectOutputStream
		// writeObject(��ü): ���(����ȭ)
		// ObjectInputStream
		// ���� = readObject: �Է�(������ȭ)
		
		// ����ȭ ��Ʈ�� ���� (��ü�� ���Ͽ� ����ϴ� ��Ʈ��)
		OutputStream os = new FileOutputStream("a.txt");
		ObjectOutputStream out = new ObjectOutputStream(os);
	
		// ������ȭ ��Ʈ�� ���� (���Ϸκ��� ��ü�� �ҷ����� ��Ʈ��)
		InputStream is = new FileInputStream("a.txt");
		ObjectInputStream in = new ObjectInputStream(is);
		
		out.writeObject(new Member("�迬��"));
		out.writeObject(new Member("������"));
		out.writeObject(new String("���ڿ��� �ɰ���?"));
		//out.writeObject(new Teacher("������"));
		
		out.close();
		
		System.out.println(in.readObject());
		System.out.println(in.readObject());
		System.out.println(in.readObject());
		//System.out.println(in.readObject());
		
		in.close();
	}

}

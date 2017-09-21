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
		// writeObject(객체): 출력(직렬화)
		// ObjectInputStream
		// 변수 = readObject: 입력(역직렬화)
		
		// 직렬화 스트림 생성 (객체를 파일에 출려하는 스트림)
		OutputStream os = new FileOutputStream("a.txt");
		ObjectOutputStream out = new ObjectOutputStream(os);
	
		// 역직렬화 스트림 생성 (파일로부터 객체를 불러오는 스트림)
		InputStream is = new FileInputStream("a.txt");
		ObjectInputStream in = new ObjectInputStream(is);
		
		out.writeObject(new Member("김연준"));
		out.writeObject(new Member("이일훈"));
		out.writeObject(new String("문자열은 될가요?"));
		//out.writeObject(new Teacher("이정태"));
		
		out.close();
		
		System.out.println(in.readObject());
		System.out.println(in.readObject());
		System.out.println(in.readObject());
		//System.out.println(in.readObject());
		
		in.close();
	}

}

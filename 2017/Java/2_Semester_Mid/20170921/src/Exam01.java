
public class Exam01 {

	public static void main(String[] args) {
		Student a = new Student("ÀÌÇå¿ì");
		Student b = new Student("ÀÌÀÏÈÆ");
		Teacher c = new Teacher("ÀÌÁ¤ÅÂ");
		
		DanTalk room = new DanTalk(24);
		
		room.enter(a);
		room.enter(b);
		room.enter(c);
		
		System.out.println(room);
	}

}

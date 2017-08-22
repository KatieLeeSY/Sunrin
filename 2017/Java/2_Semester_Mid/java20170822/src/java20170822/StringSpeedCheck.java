package java20170822;

public class StringSpeedCheck {

	public static void main(String[] args) {
		String s1 = new String("Sunrin");
		String s2 = "Web";
		
		long start = System.currentTimeMillis();
		for(int i=0;i<100_000;i++)
			s1 = s1 + s2;
		long end = System.currentTimeMillis();
		System.out.println(end-start);			//	1000 = 1ÃÊ

	}

}

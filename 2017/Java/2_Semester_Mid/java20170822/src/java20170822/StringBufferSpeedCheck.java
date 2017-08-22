package java20170822;

public class StringBufferSpeedCheck {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("sunrin");
		StringBuffer sb2 = new StringBuffer("web");
		
		long start = System.currentTimeMillis();
		for(int i=0;i<100_000;i++)
			sb1.append(sb2);
		long end = System.currentTimeMillis();
		System.out.println(end-start);

	}

}

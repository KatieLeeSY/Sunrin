package java20170907;

import java.util.StringTokenizer;

public class StExam05 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("1+2+3+4+5+6+7+8+9+10", "+");
		int sum = 0;

		while (st.hasMoreTokens()) // ��ȯ�� ��ū�� �ִ� ����
			sum += Integer.parseInt(st.nextToken());
		
		System.out.println("1+2+3+4+5+6+7+8+9+10�� ������ " + sum);

	}

}

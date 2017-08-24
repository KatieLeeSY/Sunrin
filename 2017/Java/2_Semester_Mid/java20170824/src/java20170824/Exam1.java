package java20170824;

public class Exam1 {
	public static int add(int... n) {
		int sum = 0;

		// for (int i = 0; i < n.length; i++)
		// sum += n[i];

		for (int i : n)
			sum += i;
		
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(add(1));
		System.out.println(add(1, 1));
		System.out.println(add(10, 10, 10));
	}
}

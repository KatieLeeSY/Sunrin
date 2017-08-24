package java20170824;

public class SearchMax {
	public static void printMax(double... n) {
		double max;
		int size = n.length;

		if (size == 0)
			System.out.println("넘겨받은 숫자 없음");
		else {
			max = n[0];
			for (double i : n) {
				if (max < i)
					max = i;
			}
			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		SearchMax ref = new SearchMax();
		ref.printMax();
		ref.printMax(34, 3, 3, 2.5, 56);
		ref.printMax(new double[] { 1, 2, 3 });
	}
}
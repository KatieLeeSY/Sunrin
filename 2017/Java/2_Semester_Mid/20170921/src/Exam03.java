import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) throws Exception {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner("10 20 30");
		Scanner sc3 = new Scanner(new FileReader("a.txt"));
		
		Scanner sc = sc1;	// sc1, sc2, sc3 등으로 변화를 줄 수 있다.
		
		// 아래 코드는 변화가 없다
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int sum = num1 + num2 + num3;
		
		System.out.printf("%d + %d + %d = %d", num1, num2, num3, sum);
		sc.close();
		
	}

}

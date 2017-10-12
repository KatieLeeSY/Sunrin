package java20171012;

import java.util.Scanner;

class NewException {

}

public class ExceptionEx05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		String op;
		int result = 0;

		System.out.print("첫번째 수를 입력하세요: ");
		num1 = sc.nextInt();
		System.out.print("계산할 연산자를 입력하세요: ");
		op = sc.next();
		System.out.print("두번째 수를 입력하세요: ");
		num2 = sc.nextInt();

		try {
			switch (op) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				if (num1 == 0 || num2 == 0)
					throw new Exception("0으로 곱하면 어파치 0입니다.");
				result = num1 * num2;
				break;
			case "/":
				if (num2 == 0)
					throw new Exception("0으로 나누면 안됩니다.");
				result = num1 / num2;
				break;
			}
			if (result < 0)
				throw new Exception("결과가 음수입니다.");

			System.out.println(num1 + op + num2 + "=" + result);
		} catch (Exception e) {
			System.out.print("예외 발생: ");
			System.out.println(e.getMessage());
		}
	}

}

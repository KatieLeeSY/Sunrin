package java20171010;

import java.util.Scanner;

public class ExceptionExam03 {

	public static void main(String[] args) {
		int[] array = new int[3];
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수형 a값 입력: ");
		a = sc.nextInt();
		System.out.print("정수형 b값 입력: ");
		b = sc.nextInt();
		System.out.print("정수형 c값 입력: ");
		c = sc.nextInt();
		try {
			array[c] = a / b;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스를 벗어났음");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
		} catch (Exception e) {
			System.out.println("기타 예외가 발생하였음");
		} finally {
			System.out.println("프로그램 개발자 : Katie");
		}
		
		sc.close();

	}

}

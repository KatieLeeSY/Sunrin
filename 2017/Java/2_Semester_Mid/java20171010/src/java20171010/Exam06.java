package java20171010;

import java.util.Calendar;

public class Exam06 {

	public static void main(String[] args) {
		// 날짜 객체 가져오기
		Calendar now = Calendar.getInstance(); // 싱글톤
		// 정복 얻어오기
		int year = now.get(Calendar.YEAR); // 현재년도
		int month = now.get(Calendar.MONTH) + 1; // 현재 월
		int day = now.get(Calendar.DAY_OF_MONTH); // 현재 날
		System.out.printf("%d-%d-%d\n", year, month, day);

		// 객체를 복사해봅시다
		Calendar now2 = (Calendar) now.clone();
		System.out.println("**객체를 복사완료: now2");
		now2.set(2017, 11, 31); // 2017-12-31셋팅
		System.out.println("**now2의 정보를 변경완료");
		int year2 = now2.get(Calendar.YEAR); // now2 년도 정보 가져오기
		int month2 = now2.get(Calendar.MONTH) + 1; // now2 월 정보 가져오기
		int day2 = now.get(Calendar.DAY_OF_MONTH); // now2 날짜 정보
		System.out.printf("%d-%d-%d\n", year, month, day);
		System.out.printf("%d-%d-%d\n", year2, month2, day2);
	}

}

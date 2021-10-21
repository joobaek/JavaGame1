package Game1_book;

import java.text.SimpleDateFormat; // 날짜 구분
import java.util.Date;	// 오늘의 날자
import java.util.Random; // 랜덤 숫자 표현 


public class Game1_book {

	public static void main(String[] args) {

		Date today = new Date(); //Date 클래스의 객체 생성
		SimpleDateFormat dateForm= new SimpleDateFormat("yyyy년 MM월 dd일의"); // 날짜 형식을 원하는데로 조정.
		System.out.print(dateForm.format(today)); // 오늘 날짜 출력.
		Random r = new Random(); //랜덤 함수
		int Ram = Math.abs(r.nextInt() %100)+1; // 100으로 나눈 나머지의 양수에 1을 더한 값
		
		System.out.println("금전운<100> : " + Ram + '%'); // 출력 페이지

	}


}

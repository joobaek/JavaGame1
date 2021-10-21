package Game1;

import java.text.SimpleDateFormat; // 날짜 구분
import java.util.Date;	// 오늘의 날자
import java.util.Random; // 랜덤 숫자 표현 


public class Game {

	public static void main(String[] args) {

		Date today = new Date(); //오늘 날짜를 입력하는 항목
		SimpleDateFormat dateForm= new SimpleDateFormat("yyyy년 MM월 dd일"); // 날짜 형식을 원하는데로 조정.
		Random r = new Random(); //랜덤 함수
		
		
		System.out.println(dateForm.format(today) + "의 금전운<100> : " + Math.abs(r.nextInt() %101)+ '%'); // 출력 페이지

	}

}

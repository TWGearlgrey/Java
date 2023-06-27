package sub5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/*
 * 날짜 : 2023/06/27
 * 이름 : 한상민
 * 내용 : Java Date 클래스 실습하기
 */
public class DateTest {
	public static void main(String[] args) {
		
		// Date 클래스
		Date date = new Date();
		System.out.println("date : " + date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String result = sdf.format(date);
		
		System.out.println("result : " + result);
		
		// Calendar 클래스
		//Calendar cal = new Calendar(); ~> 싱글톤이라 안 됨
		Calendar cal = Calendar.getInstance();
		
		int year  = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; //0부터 시작하기때문에 +1을 해줘야 함
		int d	  = cal.get(Calendar.DATE);
		int hour  = cal.get(Calendar.HOUR_OF_DAY);
		int min	  = cal.get(Calendar.MINUTE);
		int sec   = cal.get(Calendar.SECOND);

		System.out.printf("%d-%d-%d %d-%d-%d", year, month, d, hour, min, sec);
	}
}

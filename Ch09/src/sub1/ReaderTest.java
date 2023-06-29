package sub1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 날짜 : 2023/06/29
 * 이름 : 한상민
 * 내용 : Java 문자 스트림 실습하기
 * 
 * 문자 스트림
 *  - 아시아권 문자를 위한 문자 전용 스트림
 *  - 유니코드 기반으로 UTF-8 인코딩 처리로 아시아권 문자 인코디 처리
 */
public class ReaderTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\Java\\Desktop\\Sample1.txt";
		String target = "C:\\Users\\Java\\Desktop\\Sample2.txt";
		
		/* Sample1.txt	Sample2.txt
		 * Hello Java	Hello Java
		 * 안녕 자바 		안녕 자바
		 */
		
		try {
			// 스트림 생성(연결)
			FileReader fr = new FileReader(path);
			FileWriter fw = new FileWriter(target);
			
			while(true) {
				
				// 파일 읽기
				int data = fr.read();
				
				if(data == -1) {
					break;
				}
				
				// 숫자를 문자로 변환 (아스키코드로 출력되는 것을 막기위함)
				char ch = (char) data; 
				
				System.out.print(ch);
				
				
				// 파일 쓰기
				fw.write(data);
			}
			
			// 스트림 해제
			fr.close();
			fw.close();
			
		// 예외처리
		//} catch (Exception e) { 처럼 한번에 예외 처리해도 됨
		//	e.printStackTrace();}
		} catch (FileNotFoundException e) { // 스트림 생성시 에러 예외처리
			e.printStackTrace();
		} catch (IOException e) {			// 파일 읽기 에러 예외처리
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
		
	} // main end
}
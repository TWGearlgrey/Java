package sub5;

import java.io.File;
import java.io.IOException;

/**
 * 날짜 : 2023/06/30
 * 이름 : 한상민
 * 내용 : Java File 클래스 실습하기
 * 
 * 파일 클래스
 *  - File 클래스는 파일에 대한 경로나 정보를 조회할 때 사용하는 클래스
 *  - 별도의 입·출력 기능이 없어 스트림을 통한 데이터 입·출력
 */
public class FileTest {
	public static void main(String[] args) {
		
		// 파일 객체 생성
		File f1 = new File("C:\\Users\\Java\\Desktop\\file1.txt");
		File f2 = new File("../../../../../file2");
		
		try {
			// 파일 생성
			f1.createNewFile();
			
			// 폴더 생성
			f2.mkdir();
			
			// 파일 구분 확인 (is로 시작하는 메서드는 boolean)
			System.out.println("f1 isFile : " + f1.isFile());
			System.out.println("f1 isDirectory : " + f1.isDirectory());
			System.out.println("f2 isFile : " + f2.isFile());
			System.out.println("f2 isDirectory : " + f2.isDirectory());
			System.out.println("f1 getName : " + f1.getName());
			System.out.println("f2 getName : " + f2.getName());
			System.out.println("f1 getAbsolutePath : " + f1.getAbsolutePath()); // 절대경로 C<User<...<
			System.out.println("f2 getAbsolutePath : " + f2.getAbsolutePath());
			System.out.println("f1 Path : " + f1.getPath()); // 상대경로 : 현재 위치에서의 경로
			System.out.println("f2 Path : " + f2.getPath());
			
			// 파일 삭제
			f1.delete();
			f2.delete();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}
}
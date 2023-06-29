package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 날짜 : 2023/06/29
 * 이름 : 한상민
 * 내용 : Java 버퍼 입출력 스트림 실습하기
 * 
 * 보조스트림(버퍼)
 *  - 기본 입출력 스트림에 Buffer를 장착해서 빠른 입·출력을 지원하는 보조 스트림
 */
public class BufferIOTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\Java\\Desktop\\Workspace.zip";
		String target = "C:\\Users\\Java\\Desktop\\Workspace2.zip";

		try {
			// 스트림 생성(연결)
			FileInputStream fis = new FileInputStream(path); // 예외처리를 해줘야 함 (파일이 없을 수도 있기 때문에)
			FileOutputStream fos = new FileOutputStream(target);
			
			// 보조 스트림
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			while(true) {
				
				// 파일 읽기
				int data = bis.read();
				
				if(data == -1) {
					break;
				}
					
				// 파일 쓰기
				bos.write(data);
			}
			
			// 스트림 해제
			bis.close();
			
			bos.close();
			bos.flush(); // 버퍼를 비우기
			
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
		
	} // main end
}
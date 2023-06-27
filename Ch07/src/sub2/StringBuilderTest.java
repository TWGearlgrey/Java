package sub2;

/*
 * 날짜 : 2023/06/27
 * 이름 : 한상민
 * 내용 : Java StringBuilder 클래스 실습하기
 */
public class StringBuilderTest {
	public static void main(String[] args) {
		
		// String immutable 특성
		String str = "Java";
		System.out.println("str 객체주소 : " + System.identityHashCode(str));
		
		str += "Programming";
		System.out.println("str 객체주소 : " + System.identityHashCode(str));
		// 객체 주소값이 다른 이유는 heap에서 같은 주소에 문자열을 추가한 것이 아니라 heap이 새로 생성됐기 때문이다.
		
		System.out.println("str : " + str);
		
		
		// String의 immutable 특성을 개선한 StringBuilder
		StringBuilder sb = new StringBuilder("Java");
		System.out.println("sb 객체 주소 : " + System.identityHashCode(sb));
		
		sb.append("Programming");
		System.out.println("sb 객체 주소 : " + System.identityHashCode(sb));
		
		System.out.println("sb : " + sb);
	}
}

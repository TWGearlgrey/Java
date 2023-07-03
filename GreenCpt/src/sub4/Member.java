package sub4;

public class Member {
	private String id;
	private String pw;
	private String address;
	private String email;
	
	public Member(String id, String pw, String address, String email) {
		this.id = id;
		this.pw = pw;
		this.address = address;
		this.email = email;
	}
	
	public void result () {
		System.out.println("학생정보");
		System.out.println("----------------------");
		System.out.println("ID:" + id);
		System.out.println("PW:" + pw);
		System.out.println("Address:" + address);
		System.out.println("Email:" + email);
	}
	
	public static void main(String[] args) {
		
		Member std1 = new Member("12345", "abcde", "서울특별시 강남구 역삼동", "student@school.com");
		
		std1.result();
		
	}
}

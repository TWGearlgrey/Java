package sub1;

public class Grade {
	String name;
	double sc1, sc2, sc3;
	
	// 점수를 저장하는 메소드
	public Grade(String name, double sc1, double sc2, double sc3) {
		this.name = name;
		this.sc1 = sc1;
		this.sc2 = sc2;
		this.sc3 = sc3;
	}
	
	// 평균을 구하는 메소드
	public double avg() {
		double sum = sc1 + sc2 + sc3;
		return sum/3;
	}
	
	public static void main(String[] args) {
		// 객체 생성
		Grade std1 = new Grade ("강백호", 90.0, 85.5, 70.0);
		Grade std2 = new Grade ("채치수", 82.0, 92.0, 60.5);
		
		// 평균 메소드 호출
		double std1Avg = std1.avg();
		double std2Avg = std2.avg();
		
		// 출력
		System.out.println(std1.name + "의 평균 점수:" + std1Avg);
		System.out.println(std2.name + "의 평균 점수:" + std2Avg);
	}	
}

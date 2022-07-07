package sec02.ex01_if;

public class IfEx {

	public static void main(String[] args) {
		
		int score = 85;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급 A");
		}
		if(score < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급 B");
		}
		
	}

}

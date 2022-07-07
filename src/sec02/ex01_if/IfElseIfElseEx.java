package sec02.ex01_if;

public class IfElseIfElseEx {

	public static void main(String[] args) {
		
		int score = 75;
		
		if (score >= 90) {
			System.out.println("점수가 100~90 입니다.");
			System.out.println("등급 A");
		} else if (score >= 80) {
			System.out.println("점수가 89~80 입니다.");
			System.out.println("등급 B");
		} else if (score >= 70) {
			System.out.println("점수가 79~70 입니다.");
			System.out.println("등급 C");
		} else {
			System.out.println("점수가 70 미만입니다.");
			System.out.println("등급 D");
		}

	}

}

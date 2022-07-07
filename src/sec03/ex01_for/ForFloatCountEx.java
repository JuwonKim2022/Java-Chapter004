package sec03.ex01_for;

public class ForFloatCountEx {

	public static void main(String[] args) {
		
		for(float x = 0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);      //반복문 돌 수록 오차 발생 -> 정수를 사용하자
		}

	}

}

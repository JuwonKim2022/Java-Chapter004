package sec03.ex02_while;

public class WhileKeyContralEx {

	public static void main(String[] args) throws Exception {
		
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("----------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("----------------------");
				System.out.print("선택 : ");
			}
			keyCode = System.in.read();	//예외처리 필요. 키보드의 키코드값 읽는 메소드
			
			if(keyCode==49) {
				speed++;
				System.out.println("현재속도 = "+speed);
			} else if (keyCode==50) {
				speed--;
				System.out.println("현재속도 = "+speed);
			} else if (keyCode==51){
				run = false;
			}
//			System.out.println(keyCode);
		}
		System.out.println("프로그램이 종료.");

	}

}

package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "장보영";
		String strVar2 = "장보영";
		
		// 주소값 비교 => 동일한 객체인지
		if(strVar1 == strVar2) {
		// 참조형들은 변수에다가 주소값을 저장한다.
		// 지금 비교하는 것은 주소값이 같은지 비교하는거임
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("장보영");
		String strVar4 = new String("장보영");
		
		if(strVar3 == strVar4) {
			// 참조형들은 변수에다가 주소값을 저장한다.
			// 지금 비교하는 것은 주소값이 같은지 비교하는거임
				System.out.println("strVar3과 strVar4는 참조가 같음");
			}else {
				
				System.out.println("strVar3과 strVar4는 참조가 다름");
			}
			
			if(strVar3.equals(strVar4)) {
				System.out.println("strVar3과 strVar4는 문자열이 같음");
			}
		
	}
	

}

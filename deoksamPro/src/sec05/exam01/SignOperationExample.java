package sec05.exam01;

public class SignOperationExample {

	public static void main(String[] args) {
		
		int x = 100;
		int result1 = +x;
		int result2 = -x; //변수의 부호를 바꾸는 역할 - 
		
		System.out.println(result1);
		System.out.println(result2);
		
		byte b = 100;
		// 부호 연산자는 타입이 int이고 int를 byte로 변환x
		// byte result3 = -b;
		int result3 = -b;
		System.out.println(result3);
		
		
	}

}

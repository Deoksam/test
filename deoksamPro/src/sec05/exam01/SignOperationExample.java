package sec05.exam01;

public class SignOperationExample {

	public static void main(String[] args) {
		
		int x = 100;
		int result1 = +x;
		int result2 = -x; //������ ��ȣ�� �ٲٴ� ���� - 
		
		System.out.println(result1);
		System.out.println(result2);
		
		byte b = 100;
		// ��ȣ �����ڴ� Ÿ���� int�̰� int�� byte�� ��ȯx
		// byte result3 = -b;
		int result3 = -b;
		System.out.println(result3);
		
		
	}

}

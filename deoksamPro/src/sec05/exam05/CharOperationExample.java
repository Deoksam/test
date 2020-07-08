package sec05.exam05;

public class CharOperationExample {

	public static void main(String[] args) {

		char c1 = 'A' + 1;
		char c2 = 'A';
		//char c3 = c2 + 1; //컴파일에러
		int c3 = c2 + 1;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}

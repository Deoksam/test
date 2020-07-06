package sec02.exam04;

public class CharExample {

	public static void main(String[] args) {
		
		char c1 = 'A';
		char c2 = 65; // char타입이기때문에 유니코드 65인 A를 출력해줌
		char c3 = '\u0041'; //u = 유니코드
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4 = '가';
		char c5 = 44032; //유니코드
		char c6 = '\uAC00';
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
	}

}

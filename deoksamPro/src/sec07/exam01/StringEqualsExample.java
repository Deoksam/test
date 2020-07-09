package sec07.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "유병혁";
		String strVar2 = "유병혁";
		
		//번지비교 같은객체? 
		if(strVar1 == strVar2) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
		//문자열 같음?
		if(strVar1.equals(strVar2)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
		String strVar3 = new String("유병혁");
		String strVar4 = new String("유병혁");
		
		//번지비교 같은객체? 
		if(strVar3 == strVar4) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
			
		//문자열 같음?
		if(strVar3.equals(strVar4)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
	}

}

package sec06.exam10;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int m=2; m<=9; m++) {
			System.out.println("***" + m + "´Ü***");
			for(int i=2; i<=9; i++) {
				System.out.println(m+"X"+i+"="+(m*i));
			}
		}
	}

}

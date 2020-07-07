package sec04.exam04;

public class QStopExample {

	public static void main(String[] arg) throws Exception {
		
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) {
				System.out.println("BYE!!!");
				break;
			}
		}
	}
}
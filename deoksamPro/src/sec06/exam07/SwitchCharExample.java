package sec06.exam07;

public class SwitchCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char grade = 'B';
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("���");
				break;
			case 'B':
			case 'b':
				System.out.println("�Ϲ�");
				break;
			default:
				System.out.println("�մ�");
				break;
		}
	}

}

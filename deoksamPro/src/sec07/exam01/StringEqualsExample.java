package sec07.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "������";
		String strVar2 = "������";
		
		//������ ������ü? 
		if(strVar1 == strVar2) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");
		}
		
		//���ڿ� ����?
		if(strVar1.equals(strVar2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");
		}
		
		String strVar3 = new String("������");
		String strVar4 = new String("������");
		
		//������ ������ü? 
		if(strVar3 == strVar4) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");
		}
			
		//���ڿ� ����?
		if(strVar3.equals(strVar4)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");
		}
	}

}

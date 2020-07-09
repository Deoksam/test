package sec06.exam04;

public class IfDiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = ((int)(Math.random()*6)+1);
		
		if(num==1) {
			System.out.println("1");
			System.out.println(num);
		}else if(num==2) {
			System.out.println("2");
			System.out.println(num);
		}else if(num==3) {
			System.out.println("3");
			System.out.println(num);
		}else if(num==4) {
			System.out.println("4");
			System.out.println(num);
		}else if(num==5) {
			System.out.println("5");
			System.out.println(num);
		}else {
			System.out.println("6");
			System.out.println(num);
		}		

	}
}

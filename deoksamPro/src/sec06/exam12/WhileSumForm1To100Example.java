package sec06.exam12;

public class WhileSumForm1To100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum  = 0;
		int i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println("1~"+(i-1)+"гу: " +sum);
	}
	
	// do while 
	/*
	int sum  = 0;
	int i = 1;
	
	do {
		sum += i;
		i++;
	}while(i<=100);
	System.out.println("1~"+(i-1)+"гу: " +sum);
}
*/
}

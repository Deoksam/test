package sec.Array;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		
		int[] scores;
		scores = new int[] {83, 90, 87};
		
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("гу: " + sum1);
		
		int sum2 = add(new int[] {83,90,87});
		System.out.println(sum2);
	}
	
	public static int add(int[] scores) {
		scores = new int[] {83, 90, 87};
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}

}

package sec.Array;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		
		int[] scores = {83,90,87};
		
		System.out.println("scores[0]: "+scores[0]);
		System.out.println("scores[1]: "+scores[1]);
		System.out.println("scores[2]: "+scores[2]);
		
		//ÇÕ°ú Æò±Õ
		
		int sum = 0;
		int i;
		for(i=0; i<3; i++) {
			sum +=scores[i];
		}
		System.out.println("ÃÑÇÕ: "+sum);
		//double avg = (double)sum/scores.length;
		double avg = (double)sum/3;
		System.out.println("Æò±Õ: "+avg);
	}

}

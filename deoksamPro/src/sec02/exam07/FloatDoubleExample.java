package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		
		//float var1 = 3.14; doubleŸ���ε� floatŸ������ �����ؼ� �����Ͽ���
		float var1 = 3.14f;
		double var2 = 3.14;
		
		System.out.println(var1);
		System.out.println(var2);
		
		//���е�
		
		float var3 = 0.1234567890123456789f;
		double var4 = 0.1234567890123456789;
		
		//doubleŸ���� ���е��� �� ���� double > float
		
		System.out.println(var3);
		System.out.println(var4);
		
		double var5 = 3e6;
		float var6 = 3e6f;
		
		double var7 = 2e-3;
		float var8 = 2e-3f;
		
		System.out.println(var5);
		System.out.println(var6);
		
		System.out.println(var7);
		System.out.println(var8);
		

	}

}

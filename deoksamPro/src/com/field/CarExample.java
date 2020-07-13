package com.field;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.speed = 20;
		
		System.out.println("현재속도: "+myCar.speed);
		System.out.println("회사명: "+myCar.company);
		System.out.println("모델명: "+myCar.model);
		
	}

}

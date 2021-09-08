package com.big2team.function;

public class Divide {

	
	//Field

	
	


	//Constructor
	public Divide() {

	}
	
	
	
	//Method
	public void calcDivide(int a, int b) {
		if (b ==0) {
			System.out.println("나누는 값이 0입니다.");
		}else {
			System.out.println("나눗셈 : " + ((double)a/(double)b));
		}
		
	}
}

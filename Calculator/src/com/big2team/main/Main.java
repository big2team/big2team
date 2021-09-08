package com.big2team.main;

import java.util.Scanner;

import com.big2team.function.Abstract;
import com.big2team.function.Divide;
import com.big2team.function.Multiple;
import com.big2team.function.Sum;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 두개 입력하세요");
		System.out.print("첫번째 숫자 : ");
		int a = sc.nextInt();
		
		System.out.print("두번째 숫자 : ");
		int b = sc.nextInt();
		
		Sum sum = new Sum();
		Divide div = new Divide();
		Abstract ab = new Abstract();
		Multiple multi = new Multiple();
		
		sum.sumCalc(a, b);
		ab.abstractCal(a, b);
		multi.calcMultiple(a, b);
		div.calcDivide(a, b);
	}

}

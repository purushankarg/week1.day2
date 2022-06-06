package week1.day2;

import java.security.PublicKey;

public class Calculator {
	public int add(int a,int b, int c) {
		int sum=a+b+c;
		return sum;
	}
	public double sub(double a1,double b1) {
		double subt=a1-b1;
		return subt;
	}
	public double multi(double a2,double b2) {
		double mult=a2*b2;
		return mult;
	}
	
	public double divis(int a3,int b3) {
		int div=a3/b3;
		return div;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal = new Calculator();
		System.out.println(cal.add(3, 7, 5));
		System.out.println(cal.sub(9, 3));
		System.out.println(cal.multi(9, 3));
		System.out.println(cal.divis(9, 3));
		
		

	}

}

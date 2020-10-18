package oop.polymorphismhw;

public class Calculator {    //overloading 
	
	public int input (int  num1, int num2, int num3) {
		int result = (num2 * num1 * num3) ; 
		return result ;
	}
	public double input (double  num1, double num2, double num3, double num4) {
		double result = num1 - num2 - num3 - num4 ; 
		return result ;
	}
	public double input (double  num1, double num2, double num3, double num4, double num5) {
		double result = num1 + num2 + num3 + num4 + num5; 
		return result ;
	}
	public double input( double num5, double num6) {
		double result = (num5 / num6 ); 
		return result ;
	}
}
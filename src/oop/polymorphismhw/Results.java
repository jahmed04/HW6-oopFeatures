package oop.polymorphismhw;

public class Results {

	public static void main(String[] args) {
		
		Calculator res1 = new Calculator ();
		
		double multOfThreeNumbers = res1.input(10, 5, 2);
		System.out.println("Multiplication: "+ multOfThreeNumbers);
		
		double subOfFourNumbers = res1.input(67, 34, 10, 6);
		System.out.println("Subtraction: "+ subOfFourNumbers);
		
		double addtOfFiveNumbers = res1.input(89, 56, 23, 12, 11);
		System.out.println("Addition: "+ addtOfFiveNumbers);
		
		double divOfTwoNumbers = res1.input(10, 5);
		System.out.println("Division: "+ divOfTwoNumbers);
		
		Calc2 res2 = new Calc2 ();
		double addWithCalc2 = res2.input(67,78,34,23,19);
		System.out.println("After overriding: "+ addWithCalc2);	
	}
}
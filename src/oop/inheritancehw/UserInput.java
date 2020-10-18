package oop.inheritancehw;
import java.util.Scanner;
public class UserInput {
	
	public void name () {
		
Scanner sc = new Scanner(System.in);	
		String name = sc.nextLine();
		int age = sc.nextInt();
		int id = sc.nextInt();	
	System.out.println("Your name is:"+ name+"\t"+"Age:"+age+"\t"+"ID: \t"+id+"\n");
		
		if (id > 0 && id <= 10000) {
			System.out.println("Access granted !");
		}
		else {
			System.out.println("Invalid ID, please try again.");
		}
	}
	public String greet;
	public UserInput() {}
	public UserInput (String greet) {
		this.greet = greet ; 
		
		System.out.println(greet);
	}
}

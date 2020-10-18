package oop.encapsulationhw;

public class PatientRecord {

	public static void main(String[] args) {
		
	Patient pt1 = new Patient ("James", 101, "03-15-1992", "Yes");
	System.out.println(pt1.getPtName() +" "+ pt1.getPtID() +" "+ pt1.getPtDOB() +" "+ pt1.getPtFtime() +"\n") ;
	
	Patient pt2 = new Patient ("Adam", 102, "04-19-1994", "No");
	System.out.println(pt2.getPtName() +" "+ pt2.getPtID() +" "+ pt2.getPtDOB() +" "+ pt2.getPtFtime() +"\n") ;
	
	Patient pt3 = new Patient ("Charles", 103, "05-25-1990", "No");
	System.out.println(pt3.getPtName() +" "+ pt3.getPtID()+" "+ pt3.getPtDOB() +" "+ pt3.getPtFtime() +"\n") ;
	
	Patient pt5 = new Patient ("Mike", 105, "07-21-1991","Yes");
	System.out.println(pt5.getPtName()+" "+pt5.getPtID()+" "+pt5.getPtDOB()+" "+pt5.getPtFtime()+"\n");
	
	
	Patient pt4 = new Patient() ; 
	pt4.setPtName("Jon");
	pt4.setPtID(104);
	pt4.setPtDOB("07-12-1996");
	pt4.setPtFtime("Yes");
	
	System.out.println(pt4.getPtName()+" "+pt4.getPtID()+" "+pt4.getPtDOB()+" "+pt4.getPtFtime());
	
	
	}
}
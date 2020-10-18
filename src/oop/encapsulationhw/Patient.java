package oop.encapsulationhw;

public class Patient {
	
	private String ptName;
	private int ptID;
	private String ptDOB;
	private String ptFtime;
	private String getptID;
	
public Patient() {} 
	public Patient(String ptName, int ptID, String ptDOB, String ptFtime) {
		this.ptName = ptName;      
		this.ptID = ptID;
		this.ptDOB = ptDOB;
		this.ptFtime = ptFtime;}
	public String getPtName() {
		return ptName;
	}
	public void setPtName(String ptName) {
		this.ptName = ptName;
	}
	public int getPtID() {
		return ptID;
	}
	public void setPtID(int ptID) {
		this.ptID = ptID;
	}
	public String getPtDOB() {
		return ptDOB;
	}
	public void setPtDOB(String ptDOB) {
		this.ptDOB = ptDOB;
	}
	public String getPtFtime() {
		return ptFtime;
	}
	public void setPtFtime(String ptFtime) {
		this.ptFtime = ptFtime;
	}	
}
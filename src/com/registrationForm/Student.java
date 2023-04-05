package com.registrationForm;

public class Student 
{
	//Student Details
	private String fName;
	private String lName;
	private String classGrade;
	private int rollNo;
	private String dateOfBirth;
	private String yearOfJoining;
	private double percentage;
	
	
	//Encapsulation Through Getters and Setters To Have Control Over Data
	
	
	public String getfName() {
		return fName;
	}
	public void setStudentFirstName(String studentFirstName) {
		this.fName = studentFirstName;
	}
	public String getlName() {
		return lName;
	}
	public void setStudentLastName(String studentLastName) {
		this.lName = studentLastName;
	}
	public String getClassGrade() {
		return classGrade;
	}
	public void setClassGrade(String classGrade) {
		this.classGrade = classGrade;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(String yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	//Creating Empty constructor 
	public Student() 
	{
		super();
	}
	
	//creating parameterized constructor to pass the values
	public Student(String studentFirstName, String studentLastName, String dateOfBirth, double percentage) {
		super();
		this.lName = studentFirstName;
		this.lName = studentLastName;
		this.dateOfBirth = dateOfBirth;
		this.percentage = percentage;
	}
	
	//creating parameterized constructor to pass the values
	public Student(String studentFirstName, String studentLastName, String classGrade, int rollNo, String dateOfBirth,
			String yearOfJoining, double percentage) {
		super();
		this.lName = studentFirstName;
		this.lName = studentLastName;
		this.classGrade = classGrade;
		this.rollNo = rollNo;
		this.dateOfBirth = dateOfBirth;
		this.yearOfJoining = yearOfJoining;
		this.percentage = percentage;
	}
	
	//toString Method overridden 
	@Override
	public String toString() {
		return "Student [studentFirstName=" + lName + ", studentLastName=" + lName
				+ ", classGrade=" + classGrade + ", rollNo=" + rollNo + ", dateOfBirth=" + dateOfBirth
				+ ", yearOfJoining=" + yearOfJoining + ", percentage=" + percentage + "]";
	}
	
	
}

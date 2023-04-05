package com.registrationForm;

public class Parent 
{
	
	//
	String fatherName;
	int fatherAge;
	int motherAge;
	String motherName;
	int phoneNumber;
	String emailId;
	
	//
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public int getFatherAge() {
		return fatherAge;
	}
	public void setFatherAge(int fatherAge) {
		this.fatherAge = fatherAge;
	}
	public int getMotherAge() {
		return motherAge;
	}
	public void setMotherAge(int motherAge) {
		this.motherAge = motherAge;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	//
	public Parent() 
	{
		super();
	}
	
	
	public Parent(String fatherName, int fatherAge, int motherAge, String motherName) 
	{
		super();
		this.fatherName = fatherName;
		this.fatherAge = fatherAge;
		this.motherAge = motherAge;
		this.motherName = motherName;
	}
	
	
	public Parent(String fatherName, int fatherAge, int motherAge, String motherName, int phoneNumber, String emailId) 
	{
		super();
		this.fatherName = fatherName;
		this.fatherAge = fatherAge;
		this.motherAge = motherAge;
		this.motherName = motherName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}
	
	
	@Override
	public String toString() {
		return "Parent [fatherName=" + fatherName + ", fatherAge=" + fatherAge + ", motherAge=" + motherAge
				+ ", motherName=" + motherName + ", phoneNumber=" + phoneNumber + ", emailId=" + emailId + "]";
	}
	
	
	
}

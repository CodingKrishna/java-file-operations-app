package com.files;

public class Student {
	
	private    int id;
	private String name;
	private  String mobileNo;
	private String emailId;
	
	public Student(int id, String name, String mobileNo, String emailId) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobileNo="
				+ mobileNo + ", emailId=" + emailId + "]";
	}

}

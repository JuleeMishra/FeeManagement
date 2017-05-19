package com.dss.beans;
class StudentBean{
	private int rollno,fee,paid,due;;
	private String name,email,sex,course;
	private String address,contact;
	
	public void setRollno(int rollno){
		this.rollno = rollno;
	}
	public int getRollno(){
		return rollno;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return email;
	}
	
	public void setSex(String sex){
		this.sex = sex;
	}
	public String getSex(){
		return sex;
	}
	
	public void setCourse(String course){
		this.course = course;
	}
	public String getCourse(){
		return course;
	}
	
	public void setFee(int fee){
		this.fee = fee;
	}
	public int getFee(){
		return fee;
	}
	
	public void setPaid(int paid){
		this.paid = paid;
	}
	public int getPaid(){
		return paid;
	}
	
	public void setDue(int due){
		this.due = due;
	}
	public int getDue(){
		return due;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return address;
	}
	
	public void setContact(String contact){
		this.contact = contact;
	}
	public String getFee(){
		return contact;
	}
	
}
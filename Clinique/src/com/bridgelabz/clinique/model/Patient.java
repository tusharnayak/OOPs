package com.bridgelabz.clinique.model;

public class Patient {
	private String pName;
	private int pId;
	private long mobno;
	private int age;
	
	
	@Override
	public String toString() {
		return "Patient [pName=" + pName + ", pId=" + pId + ", mobno=" + mobno + ", age=" + age + "]";
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}

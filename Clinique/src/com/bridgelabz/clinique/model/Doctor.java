package com.bridgelabz.clinique.model;

public class Doctor {
	private String dName;
	private int dId;
	private String spec;
	private String avail;
	private int appointment;
	
	
	public String getdName() {
		return dName;
	}
	@Override
	public String toString() {
		return "Doctor [dName=" + dName + ", dId=" + dId + ", spec=" + spec + ", avail=" + avail + ", appointment="
				+ appointment + "]";
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	public String getAvail() {
		return avail;
	}
	public void setAvail(String avail) {
		this.avail = avail;
	}
	public int getAppointment() {
		return appointment;
	}
	public void setAppointment(int appointment) {
		this.appointment = appointment;
	}
	

}

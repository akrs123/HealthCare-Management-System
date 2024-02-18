package com.Healthcare.manage;

public class Healthcare {
	
	private int patientId;
	private String patientName;
	private String patientAge;
	private String patientPhone;
	private String patientCity;
	
	
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(String patientAge) {
		this.patientAge = patientAge;
	}
	public String getPatientPhone() {
		return patientPhone;
	}
	public void setPatientPhone(String patientPhone) {
		this.patientPhone = patientPhone;
	}
	public String getPatientCity() {
		return patientCity;
	}
	public void setPatientCity(String patientCity) {
		this.patientCity = patientCity;
	}
	
	public Healthcare(int patientId, String patientName, String patientAge, String patientPhone, String patientCity) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientPhone = patientPhone;
		this.patientCity = patientCity;
	}
	
	public Healthcare(String patientName, String patientAge, String patientPhone, String patientCity) {
		super();
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientPhone = patientPhone;
		this.patientCity = patientCity;
	}
	
	public Healthcare() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Healthcare [patientId=" + patientId + ", patientName=" + patientName + ", patientAge=" + patientAge
				+ ", patientPhone=" + patientPhone + ", patientCity=" + patientCity + "]";
	}
	 
	

}

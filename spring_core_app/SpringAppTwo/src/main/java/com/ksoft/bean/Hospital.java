package com.ksoft.bean;

import java.util.List;

public class Hospital {

	private int regNo;
	private String name;
	private int bedCount;

	private Doctor doctor;

	private List<Patient> patients;

	public Hospital(int regNo, String name, int bedCount) {

		System.out.println("Hospital.Hospital() constructor called");
		this.regNo = regNo;
		this.name = name;
		this.bedCount = bedCount;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		System.out.println("Hospital.setDoctor()");
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Hospital [regNo=" + regNo + ", name=" + name + ", bedCount=" + bedCount + "]";
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

}

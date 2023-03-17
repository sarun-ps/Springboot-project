package com.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int regno;
	private String sname;
	private String dept;
	private double fees;
	@Override
	public String toString() {
		return "Student [regno=" + regno + ", sname=" + sname + ", dept=" + dept + ", fees=" + fees + "]";
	}
	
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
}

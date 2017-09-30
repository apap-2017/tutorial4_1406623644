package com.example.tutorial4.model;

public class StudentModel {
	private String name;
	private String npm;
	private double gpa;
	
	public StudentModel (String name, String npm, double gpa) {
		this.name = name;
		this.npm = npm;
		this.gpa = gpa;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public void setNpm (String npm) {
		this.npm = npm;
	}

	public void setGpa (double gpa) {
		this.gpa = gpa;
	}
	
	public String getName () {
		return this.name;
	}
	
	public String getNpm () {
		return this.npm;
	}
	
	public double getGpa () {
		return this.gpa;
	}
}

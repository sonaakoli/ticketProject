package com.sonali.RequestBinding;

import java.util.Date;



public class Passenger {
	private String fname;
	private String lname;
	private String From;
	private String To;
	private int doj;
	
	
	public Passenger(String fname, String lname, String from, String to, int doj) {
		super();
		this.fname = fname;
		this.lname = lname;
		From = from;
		To = to;
		this.doj = doj;
	}


	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getFrom() {
		return From;
	}


	public void setFrom(String from) {
		From = from;
	}


	public String getTo() {
		return To;
	}


	public void setTo(String to) {
		To = to;
	}


	public int getDoj() {
		return doj;
	}


	public void setDoj(int doj) {
		this.doj = doj;
	}


	@Override
	public String toString() {
		return "Passenger [fname=" + fname + ", lname=" + lname + ", From=" + From + ", To=" + To + ", doj=" + doj
				+ "]";
	}
	

}

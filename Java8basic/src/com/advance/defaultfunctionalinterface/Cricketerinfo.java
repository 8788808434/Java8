package com.advance.defaultfunctionalinterface;

public class Cricketerinfo {

	private int no;
	private String name;
	private long totalruns;
	private int centure;
	private int halfcentury;
	private double average;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getTotalruns() {
		return totalruns;
	}
	public void setTotalruns(long totalruns) {
		this.totalruns = totalruns;
	}
	public int getCenture() {
		return centure;
	}
	public void setCenture(int centure) {
		this.centure = centure;
	}
	public int getHalfcentury() {
		return halfcentury;
	}
	public void setHalfcentury(int halfcentury) {
		this.halfcentury = halfcentury;
	}
	public double getAverage() {
		return average;
	}
	@Override
	public String toString() {
		return "Cricketerinfo [no=" + no + ", name=" + name + ", totalruns=" + totalruns + ", centure=" + centure
				+ ", halfcentury=" + halfcentury + ", average=" + average + "]";
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public Cricketerinfo(int no, String name, long totalruns, int centure, int halfcentury, double average) {
		super();
		this.no = no;
		this.name = name;
		this.totalruns = totalruns;
		this.centure = centure;
		this.halfcentury = halfcentury;
		this.average = average;
	}
	
	
	
}

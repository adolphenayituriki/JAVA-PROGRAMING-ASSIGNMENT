package com.Entities;

public class Triangle {
	private double base;
    private double height;
    private double hypo;
    
	
	public double getBase() {
		return base;
	}
	public double getHeight() {
		return height;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double calcurateArea(double base, double height){
		this.base = base;
		this.height = height;
		return (this.base*this.height)/2;
	}
	public double calcuratePermeter(double base, double heigth, double hypo){
		return this.base+this.height+this.hypo;
	}
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + ", hypo="
				+ hypo + ", getBase()=" + getBase() + ", getHeight()="
				+ getHeight() + "]";
	}
	

}

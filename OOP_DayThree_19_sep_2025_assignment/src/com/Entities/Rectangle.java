package com.Entities;

public class Rectangle {
	private double width;
	private double length;
	private static double a;
	
	public  Rectangle (double length, double width){
		this.length=length;
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
	public double getLegth() {
		return length;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setLegth(double legth) {
		this.length = legth;
	}
	
	public static void DisplayArea(){
		System.out.println("Area: "+(a));
	}
	
	//calculate area and calculate perimeter
	public double calcurateArea(){
		return this.length*this.width;
	}
	public double calcuratePerimeter(){
		return 2*(this.width+this.length);
	}
	//add toSting method
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length
				+ ", getWidth()=" + getWidth() + ", getLegth()=" + getLegth()
				+ ", Area=" + calcurateArea()
				+ ", Perimeter)=" + calcuratePerimeter()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}

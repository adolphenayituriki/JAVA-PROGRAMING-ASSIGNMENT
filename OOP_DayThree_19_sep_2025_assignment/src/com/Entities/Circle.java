package com.Entities;

public class Circle {
	private double radius;

	public Circle (double radius){
		this.radius = radius;
	}
	public double CalcurateArea(){
		return Math.PI*(radius* radius);//(radius*radius)
	}
	public double calcurateCircumf(){
		return 2*Math.PI*radius;
	}
	public String toString() {
		return "Circle [radius=" + radius + ", Area of circle="
				+ CalcurateArea() + ", Circumference="
				+ calcurateCircumf() + "]";
	}
	
}

package com.TestEntities;

import com.Entities.Circle;
import com.Entities.Rectangle;

public class TestCircle {

	public static void main(String[] args) {
		Circle cr = new Circle(5);
		cr.CalcurateArea();
		cr.calcurateCircumf();
		System.out.println("Area: "+cr.CalcurateArea());
		System.out.println("Circumference: "+cr.calcurateCircumf());
		
		//printing by static method from rectangle
		Rectangle radius = new Rectangle(7, 7);
		System.out.println("Area of rectangle  by using Static: "+radius);
         Rectangle.DisplayArea();
         
		//Printing by toString
		System.out.print(cr.toString());
		
	}

}

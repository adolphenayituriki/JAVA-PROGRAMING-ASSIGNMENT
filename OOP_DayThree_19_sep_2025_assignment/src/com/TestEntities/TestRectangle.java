package com.TestEntities;

import com.Entities.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {
	Rectangle box = new Rectangle(12,54);
	double area = box.calcurateArea();
	double perimeter = box.calcuratePerimeter();
	System.out.println("\n==============");
	System.out.println("The value of area: "+area);
	System.out.println("The value of perimeter: "+perimeter);
	
		System.out.println("\n=====PRINTING BY toString=====");
		Rectangle box2 = new Rectangle(12,54);
		System.out.println(box2.toString());
	}

}

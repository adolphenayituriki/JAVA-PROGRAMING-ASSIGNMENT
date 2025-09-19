package com.TestEntities;

import com.Entities.Rectangle;
import com.Entities.Square;

public class TestSquare {

	public static void main(String[] args) {
	Square box = new Square(5,5);
	double area = box.calcurateArea();
	double perimeter = box.calcuratePerimeter();
	System.out.println("\n==============");
	System.out.println("The value of area: "+area);
	System.out.println("The value of perimeter: "+perimeter);
	
		System.out.println("\n=====PRINTING BY toString=====");
		Rectangle box2 = new Rectangle(5,5);
		System.out.println(box2.toString());
	}

}

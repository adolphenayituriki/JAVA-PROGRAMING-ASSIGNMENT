package com.TestEntities;

import java.util.Scanner;

import com.Entities.Triangle;

public class TestTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangle tr = new Triangle();
		double area = tr.calcurateArea(8, 8);
		double permeter = tr.calcuratePermeter(8, 8, 10);
		System.out.println("The value of  area: "+area);
	}
	
}

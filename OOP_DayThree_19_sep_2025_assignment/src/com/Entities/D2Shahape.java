package com.Entities;

import java.util.Scanner;

public class D2Shahape {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		//instance to access Rectangle class
		Rectangle rc = new Rectangle(6,4);
		rc.calcurateArea();
		rc.calcuratePerimeter();
		//instance to access Circle class
		Circle cr = new Circle(5);
		cr.CalcurateArea();
		cr.calcurateCircumf();
		cr.toString();
		//instance to access Square class
		Square sq = new Square(5, 5);
		sq.calcurateArea();
		sq.calcuratePerimeter();
		//instance to access Triangle class
		Triangle tr = new Triangle();
		double triangleArea=tr.calcurateArea(6, 8);
		double trianglePermeter=tr.calcuratePermeter(8, 7, 9);

		int choice = 0;
		do{
			System.out.println("Select a shape");
			System.out.println("'''''''''''''''''''''''''''''");
			System.out.println("1. Rectangle");
			System.out.println("2. Circle");
			System.out.println("3. Square");
			System.out.println("4. Triangle");
			System.out.println("Select: ");
			int enterChoice = sc.nextInt();

			int select;
			switch(enterChoice){
			//RECTANGLE CALCURATE
			case 1:
				System.out.println("you selected: "+enterChoice);
				System.out.println("What would you like to calcurate on rectangle:\n");
				System.out.println("1. Area");
				System.out.println("2. Perimeter");
				System.out.println("Select: ");
				select = sc.nextInt();
				if (select==1){
					System.out.println("Area of rectangle: "+rc.calcurateArea());
					System.out.println("Area of rectangle by toString: "+rc.toString());

				}else if(select==2){
					System.out.println("Perimeter of rectangle: "+rc.calcuratePerimeter());
					System.out.println("Perimeter of rectangle by toString: "+rc.toString());
					
				}else{
					System.out.println("Invalid Selection");
				}
				
				break;
				//CIRCLE CALCURATE
			case 2:
				System.out.println("you selected: "+enterChoice);
				System.out.println("What would you like to calcurate on circle:\n");
				System.out.println("1. Area");
				System.out.println("2. Circumference");
				System.out.println("Select: ");
				select = sc.nextInt();

				if (select==1){
					System.out.println("Area of circle: "+cr.CalcurateArea());
					System.out.println("Area of circle by toString: "+cr.toString());

				}else if(select==2){
					System.out.println("Circumfreance of circle: "+cr.calcurateCircumf());
					System.out.println("Circumfreance of circle by toString: "+cr.toString());
				}else{
					System.out.println("Invalid Selection");
				}
				break;
				//SQUARE CALCURATE
			case 3:
				System.out.println("you selected: "+enterChoice);
				System.out.println("What would you like to calcurate square:\n");
				System.out.println("1. Area");
				System.out.println("2. Perimeter");
				System.out.println("Select: ");
				select = sc.nextInt();

				if (select==1){
					System.out.println("Area of square: "+sq.calcurateArea());
					System.out.println("Area of square by toString: "+sq.toString());

				}else if(select==2){
					System.out.println("Perimeter of square: "+sq.calcurateArea());
					System.out.println("Perimeter of square by toString: "+sq.toString());
				}else{
					System.out.println("Invalid Selection");
				}
				break;
				//TRIANGLE CALCURATE
			case 4:
				System.out.println("you selected: "+enterChoice);
				System.out.println("What would you like to calcurate on triangle:\n");
				System.out.println("1. Area");
				System.out.println("2. Perimeter");
				System.out.println("Select: ");
				select = sc.nextInt();

				if (select==1){
					System.out.println("Area of triangle: "+triangleArea);

				}else if(select==2){
					System.out.println("Perimeter of triangle: "+trianglePermeter);
				}else{
					System.out.println("Invalid Selection");
				}
				break;
                
			}
			
			System.out.println("\nDo you want to calculate again (y/n)");
			choice=sc.next().charAt(0);
		}
		
		
		while (choice =='y' || choice=='y');
		System.out.println("Thank you for using our calculator");
		sc.close();
	}
	

}

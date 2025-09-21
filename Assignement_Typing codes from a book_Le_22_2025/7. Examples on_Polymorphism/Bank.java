package example7_Polymorphism;
//Java Program to demonstrate the real scenario of Java Method Overriding
//creating a parent class
public class Bank {
	int getRateOfInterest(){
			return 0;
	}

}
//creating child classes
class KSB extends Bank{
	int getRateOfInterest(){
		return 8;
	}
}
class EQUITY extends Bank{
	int getRateOfInterest(){
		return 7;
	}
}
class Bk extends Bank {
	int getRateOfInterest(){
		return 9;
	}
}
//Test the classes  to create  objects  and call the methods
class Test2{
	public static void main(String[] args) {
		KSB K = new KSB();
		EQUITY e = new EQUITY();
		Bk b = new Bk();
		System.out.println(" KSB Rate of interest: "+ K.getRateOfInterest());
		System.out.println(" EQUITY Rate of interest: "+ e.getRateOfInterest());
		System.out.println(" AXIS Rate of interest: "+ b.getRateOfInterest());
		
	}
}

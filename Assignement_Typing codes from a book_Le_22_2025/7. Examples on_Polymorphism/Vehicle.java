package example7_Polymorphism;
//this is a java program to illustrate  the use uf java methos overrriding 
public class Vehicle {
	//defining a method
	void run(){
		System.out.println("Vehicle is running");
	}
}
	//Creating a child class
	class Bike2 extends Vehicle{
		//defining the same method as in the parent class
		@Override
		void run() {
			System.out.println("Bike is runnong safely");
			super.run();
		}
	public static void main(String[] args) {
		Bike2 Myob = new Bike2(); //creating an object
		Myob.run();
	}
}


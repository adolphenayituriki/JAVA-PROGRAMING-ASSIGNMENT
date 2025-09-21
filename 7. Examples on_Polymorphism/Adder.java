package example7_Polymorphism;

public class Adder {
	static int add (int a, int b){
		return a+b;
	}
	//test overloading
	class TestOverloading1{
	public static void main(String[] args) {
		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(111, 11));

	}
	}
}

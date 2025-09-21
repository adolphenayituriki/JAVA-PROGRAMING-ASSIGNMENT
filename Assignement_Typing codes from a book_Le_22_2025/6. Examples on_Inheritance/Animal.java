package Example6_Inheritance;
//Single inheritamnce

class Animal {
	void eat(){
		System.out.println("Eating..........");
	}
}
	class Dog extends Animal{
		void bark(){
			System.out.println("Backing.........");
		}
	}
	class TestInheritance{
	public static void main(String[] args) {
		Dog d= new Dog();
		d.bark();
		d.eat();

	}
	}


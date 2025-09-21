package Example6_Inheritance;
//Hierarchical Inheritance Example
public class Animal3 {
	void eat(){
		System.out.println("Eating...");
      }
}
	class Dog extends Animal3{
		void bark(){System.out.println("barking...");
	      }
      }
	class Cat extends Animal3 {
		void meow(){System.out.println("Meowing...");;
	}
	}
	class TestInheritance3{
		public static void main(String[] args) {
		Cat c= new Cat();
		c.meow();
		c.eat();
		//c.bark();//C.T.Error

	}
	}


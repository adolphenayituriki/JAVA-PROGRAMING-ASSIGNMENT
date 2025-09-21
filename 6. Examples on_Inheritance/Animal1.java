package Example6_Inheritance;
//Miltilevel Inheritance
public class Animal1 {
	void eat(){
		System.out.println("eating...");
      }
}
	class Dog extends Animal1{
		void bark(){System.out.println("barking...");
	}
}
	class babyDog extends Dog{
		void weep(){
			System.out.println("weeping...");
		}
	}
	class TestInheritance2{
	public static void main(String[] args) {
		babyDog d = new babyDog();
            d.weep();
		d.bark();
		d.eat();
	}

}


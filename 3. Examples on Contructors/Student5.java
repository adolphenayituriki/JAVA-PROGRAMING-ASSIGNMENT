package Example3Contructors;

public class Student5 {
	int id;
	String name;
	int age;
	//creating two args constructor
	Student5 (int i, String n){
		id =i;
		name =n;
	}
	//creating three args constructor
	Student5(int i, String n, int a){
		id =i;
		name = n;
		age = a;
	}
	void display(){System.out.println(id+" "+name+" "+age);}
	public static void main(String[] args) {
		Student5 s1 = new Student5(111, "peter");
		Student5 s2 = new Student5(222, "Aryan",25);
		//display
		s1.display();
		s2.display();
		

	}

}

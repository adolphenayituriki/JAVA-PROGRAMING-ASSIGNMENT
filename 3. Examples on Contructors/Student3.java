package Example3Contructors;
//another example of default constructor which display  the default value

public class Student3 {
      int id;
	String name;
	//Method do display the value of id and name
	void display(){System.out.println(id+" "+name);}
	public static void main(String[] args) {
		//creating an objects
		Student3 s1 = new Student3();
		Student3 s2 = new Student3();
		//Display the value of objects
		s1.display();
		s2.display();

	}

}

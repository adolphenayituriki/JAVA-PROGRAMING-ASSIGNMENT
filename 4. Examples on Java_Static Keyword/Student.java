package Example4Java_StaticKeyword;

public class Student {
	int rollno;//instance variable
	String name;
	static String collage = "INES";//static variable
	//constructor
	Student(int r, String n, String c){
		rollno = r;
		name = n;
	}
	//Method to display the values
	void display(){System.out.println(rollno+" "+ name+" "+ collage);}
	//Test class to show the values of an object 
	public class TestStaticVariable1 {
	public static void main(String[] args) {
	Student s1 = new Student(111, "peter", collage);
	Student s2 = new Student(222, "Aryan",collage);
      //we can change the college of all objects by the single line of code
	//s1.collage = "UR";
	s1.display();
	s2.display();
	}

}
}

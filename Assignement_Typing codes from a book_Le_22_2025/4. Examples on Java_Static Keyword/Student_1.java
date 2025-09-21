package Example4Java_StaticKeyword;

public class Student_1 {
	int rollno;
	String name;
	static String college;
	//Static method too change the value of static valiable
	static void change(){
		college ="BBDIT";
	}
	//constructor to initialize  the valiable
	Student_1(int r, String n){
		rollno =r;
		name =n;
	}
	//method to display value
	void display(){System.out.println(rollno+" "+name+" "+ college);}
	//Test class to create and display the values of object
	public static void main(String[] args) {
		Student_1.change();//calling change method
		//creating  the object
		Student_1 s1 = new Student_1(111, "Allen");
		Student_1 s2 = new Student_1(111, "Aryan");
		Student_1 s3 =new Student_1(333, "Nancy");
		//calling display method
		s1.display();
		s2.display();
		s3.display();
	}

}

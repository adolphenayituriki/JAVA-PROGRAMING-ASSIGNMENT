package Example3Contructors;

public class Student4 {
	int id;
	String name;
	//creating a parametized constructor
	Student4(int i, String n){
		id =i;
		name = n;
	}
	//method to display value
	void displayValue(){System.out.println(id+ " "+name);}
	public static void main(String[] args) {
		//creating object and passing value
		Student4 s1 = new Student4(111, "Karan");
		Student4 s2 = new Student4(222, "Aryan");
		//calling methods to display  the values of object
		s1.displayValue();
		s2.displayValue();
	}

}

package com.Example1;
//Object and Class Example: Initialization through reference
class Student {
	int id;
	String name;
}
class TestStudent2 {
	public static void main(String[] args){
	Student  s1 = new Student();
	s1.id = 101;
	s1.name = "Adolphe";
	System.out.println(s1.id+" "+ s1.name);//printing  numbers with a white space
}
	}
class TestStudent3{
	public static void main(String [] args){
		//create objects
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		//initializing object
		s1.id =101;
		s1.name = "Adolphe";
		s2.id = 102;
		s2.name = "Evode";
            s3.id =103;
		s3.name = "Bernard";
		//print data
		System.out.println(s1.id+ " "+s1.name);
		System.err.println(s2.id+" "+s2.name);
		System.err.println(s3.id+" "+s3.name);
	}
}



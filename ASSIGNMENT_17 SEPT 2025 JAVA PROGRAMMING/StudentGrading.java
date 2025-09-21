package assignment.billCulculate;
import java.util.Scanner;

public class StudentGrading {
	public static void main(String[] args) {
		System.out.println("=====WELCOME TO STUDENT GRADING SYSTEM=====\n");
		int studentNum = 0;
		String studentName = "";
		double marks = 0;
        double  TotalMarks = 0;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("How many student do you have in your class? ");
	    studentNum =sc.nextInt();
	    String [] student = new String[studentNum];
		double mark [] = new double[studentNum];
		double Average=0;
		char Category = 0;
		//ADD DATA INTO THE ARRAY
		for (int i=0; i<studentNum; i++){
			System.out.println("Enter Student "+ (i+1));
			student[i] = sc.next ();
			
	}
		//ADD MARKS INTO THE ARRAY
				for (int i=0; i<studentNum; i++){
					System.out.println("Enter the marks for : "+ student[i]);
					mark[i] = sc.nextDouble ();
			
	}	
				//NOW PERFORM THE SUMMATION
				System.out.println("Student \t Marks");
				System.out.println("---------------------------");
				
				for (int i=0; i<studentNum; i++){
					TotalMarks +=mark[i];
					System.out.println("|"+student[i] + "|\t" +mark[i]+"|");
					System.out.println("CATEGORY : "+Category);
					System.out.println("---------------------------");
					
				}
				
				Average = TotalMarks/studentNum;
                if (Average>=80){ 
                	Category = 'A';
				}
                else if (Average>=70){
                	Category = 'B';
                }
                else if (Average>=60){
                	Category = 'C';
                }
                else if (Average>=50){
                	Category = 'D';
                }
                else{
                	Category ='F';
                }

}
	
}


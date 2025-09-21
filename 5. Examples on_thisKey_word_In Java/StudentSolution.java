package Example5_thisKey_word_InJava;
//public class or base class
public class StudentSolution {
	int rollno;
	String name;
	float fee;

      StudentSolution(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
      }
      void display() {
            System.out.println(rollno + " " + name + " " + fee);
      }
}
class TestThis1 {
      public static void main(String[] args) {
		StudentSolution s1 = new StudentSolution(111, "Adolphe", 5000f);
		StudentSolution s2 = new StudentSolution(112, "Alice", 6000f);

		s1.display();
		s2.display();
      }
}
package Example5_thisKey_word_InJava;

public class A {
	void m(){System.out.println("Hello m");}
	void n(){
		System.out.println("Hello n");//m();//same as this .m()
		this.m();
	}
      static class TestThis4{
	public static void main(String[] args) {
		A a=new A();
		a.n();

	}

}
}


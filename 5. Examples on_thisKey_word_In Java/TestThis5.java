package Example5_thisKey_word_InJava;

class A1 {
    // Default constructor
    A1() {
        System.out.println("Hello a");
    }

    // Parameterized constructor
    A1(int x) {
        this(); // Calls the default constructor
        System.out.println(x);
    }
}

public class TestThis5 {
    public static void main(String[] args) {
        A1 a = new A1(10);
        System.out.println(a);
    }
}

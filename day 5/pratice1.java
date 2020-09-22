
class A {
	A() {
		System.out.println("no-arg a");
	}

	A(int i) {
		this();
		System.out.println("parameter");
	}

}

class B extends A {
	B() {
		// super();
		System.out.println("no-arg b");
	}

	B(int i) {
		super(10);
		System.out.println("parameter b");
	}
}

public class pratice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B(10);

	}

}

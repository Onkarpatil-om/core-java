class A {
	private static int count;

	A() {
		// this(10);
		System.out.println("no-arg");
	}

	A(int count) {
		this();
		this.count = count;
		System.out.println("parameter" + count);
	}

}

public class Q41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A(100);

		// A a2 = new A();
	}

}

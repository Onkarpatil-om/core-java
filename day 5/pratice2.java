class person {
	int i = 100;

	void show() {

		System.out.println(i);
	}

	void getdata() {

		System.out.println(i);
	}
}

class Employee extends person {
	void show() {
		// super.show();
		int i = 200;
		System.out.println(i + " " + super.i);

	}

	void getD() {
		System.out.println("casting");
	}
}

/*
 * class developer extends Employee { void show() { System.out.println("ommi");
 * } }
 */

public class pratice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person e = new Employee();
		// Employee e = new Employee();
		// Employee e1 = (Employee) e;
		// person d = new developer();
		e.show();
		e.getdata();
		// d.show();
		// d.getdata();
		// e.getD();
		// e1.getD();
	}

}
